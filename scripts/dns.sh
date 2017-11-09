#!/bin/bash

for file in /vagrant/dns/*
do
  curl -XPUT http://localhost:8500/v1/agent/service/register -d @/vagrant/dns/$file
done
