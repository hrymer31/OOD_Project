public class Factory implements ReadFactory, WriteFactory{
    @Override
    public void ReturnInfo(){
        System.out.println("Trip Information:");
    }

    @Override
    public void ReturnObject() {

    }

   Factory factory = new Factory();
    ReadFactory Readfactory = factory;
    WriteFactory writeFactory = factory;
}
