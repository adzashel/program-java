   // lebih dari 24 kena biaya harian ditambah waktu parkir perjjam
            long firstDayFee = 80000;
            int nextDay = (int) Math.ceil((double) time - 24 / 24);
            int feePerDay = 60000;
            int nextDayFee = nextDay * feePerDay;
            return firstDayFee + nextDa