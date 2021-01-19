n=gets.to_i;
if(n.between?(1,15))
  x=2
  n.times do
    x+=(x-1)
  end
  puts x*x
end
