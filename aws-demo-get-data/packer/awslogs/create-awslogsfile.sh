#!/bin/bash                                                                                  

AWSCONFIGLOG=/etc/awslogs/awslogconfig.log

datestr="$(date +%Y-%m-%d:%H:%M:%S)"
echo "Starging log configuration at: $datestr" >> $AWSCONFIGLOG
echo "Calling curl..." >> $AWSCONFIGLOG
SG="$(curl http://169.254.169.254/latest/meta-data/security-groups/)"
echo "SG: $SG" >> $AWSCONFIGLOG
echo "Calling grep..." >> $AWSCONFIGLOG
MYENVSTR="$(echo $SG | grep -oP "^([^-]*\-){0}\K[^-]*")"
echo "MYENVSTR:: $MYENVSTR" >> $AWSCONFIGLOG
echo "Calling sed..." >> $AWSCONFIGLOG
sed "s/MYENV/$MYENVSTR/g" /etc/awslogs/awslogs.conf-TEMPLATE > /etc/awslogs/awslogs.conf
echo "Calling restarting the awslogs service..." >> $AWSCONFIGLOG
sudo service awslogs restart >> $AWSCONFIGLOG
datestr="$(date +%Y-%m-%d:%H:%M:%S)"
echo "DONE at: $datestr" >> $AWSCONFIGLOG
