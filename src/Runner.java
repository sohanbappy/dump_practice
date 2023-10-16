
class Runner {



    public static void main(String[] args) {
        //debugger a
        long targetId = 8313811347991371218L;
        long timeStamp = getTimestamp(targetId);
        //Added by aaa
        System.out.println("Timestamp: "+timeStamp);
        System.out.println("Diff: "+(targetId-timeStamp));
    }

    private static long getTimestamp(long targetId){
        //New comment bappy
        SequenceGeneratorService sequenceGeneratorService = new SequenceGeneratorService(9);
        long result = sequenceGeneratorService.nextId();
        return result;
    }


}
