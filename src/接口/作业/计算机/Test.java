package 接口.作业.计算机;

public class Test {
    public static void main(String[] args) {
        ComputerCPU computerCPU = new ComputerCPU();
        ComputerEMS computerEMS = new ComputerEMS();
        ComputerHardDisk computerHardDisk = new ComputerHardDisk();
        System.out.println("计算机的信息如下：" );
        System.out.println(computerCPU.CPU());
        System.out.println(computerEMS.EMS());
        System.out.println(computerHardDisk.HardDisk());
    }
}
