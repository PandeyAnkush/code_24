#!/bin/bash

# Read 'n' from the console
echo "Enter the value of n: "
read n

# Loop from 1 to 'n' and print odd numbers
for ((i=1; i<=n; i+=2))
do
    echo "$i"
done
