abstract class HOSPITAL
{
abstract void patients();
}
class COLUMBIA extends HOSPITAL
{
void patients()
{
System.out.println("COLUMBIA-ASIA:10 PATIENTS");
}
}
class APOLLO extends HOSPITAL
{
void patients()
{
System.out.println("APOLLO:20 PATIENTS");
}
}
class MANIPAL extends HOSPITAL
{
void patients()
{
System.out.println("MANIPAL: 15 PATIENTS");
}
}
class NIMHANS extends HOSPITAL
{
void patients()
{
System.out.println("NIMHANS: 40 PATIENTS");
}
}
class abstractcla
{
public static void main(String args[])
{
COLUMBIA obj=new COLUMBIA();
APOLLO obj1=new APOLLO();
MANIPAL obj2=new MANIPAL();
NIMHANS obj3=new NIMHANS();
obj.patients();
obj1.patients();
obj2.patients();
obj3.patients();
}
}
