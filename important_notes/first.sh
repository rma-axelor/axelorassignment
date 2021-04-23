 # GNU nano 5.3                                                      first.sh                                                                
#!/bin/bash

#For loop
for i in 1,2,3,4
do
   echo "$i"
done

for i in 1,3,5
do
   echo "$i"
done 

#Arrays
name[0]="ZARA"
name[1]="QADIR"
name[2]="Mahnaz"
echo "${name[@]}"

#Function
hello()
{
    echo "Function declaration!!"
    return 10
}
hello
ret=$?
echo "Return value is $ret"
#exithematic expression
val=`expr 20 + 30`
echo "$val"
a=2
b=2


#case
echo "select a city (bangalore,hyderabad,mumbai,chennai) i will give is the specifictaon of the city"
read value
case "$value" in
"bangalore") echo "bangalore is known as the garden city and also the silicon capital of india";;
"chennai") echo "chennai is known for its movies";;
esac

#if elif and else
if [ $a -eq $b ]
then
echo "a is equal to b"
elif [ $a -gt $b ]
then 
echo "a is greater than b"
else 
echo "a is less than b"
fi
