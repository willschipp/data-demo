#!/bin/bash

for file in /vagrant/scripts/dns/*
do
  curl -XPUT http://localhost:8500/v1/agent/service/register -d @$file
done
