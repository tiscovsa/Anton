from broker import Broker
from publisher import Publisher
from subscriber import Subscriber
import time 


def main():
    broker = Broker("127.0.0.1", 49000)
    publisher = Publisher("127.0.0.1", 49000, "127.0.0.1", 49001)
    subscriber_1 = Subscriber("127.0.0.1", 49002, "127.0.0.1", 49000)
    subscriber_2 = Subscriber("127.0.0.1", 49003, "127.0.0.1", 49000)

    broker.listen()
    print("MAIN: Broker listening")
    subscriber_1.listen()
    subscriber_2.listen()
    print("MAIN: Both subscribers listening")

    subscriber_1.subscribe("IQ")
    subscriber_1.subscribe("5EX")
    subscriber_2.subscribe("IQ")

    
    print("MAIN: All subscribers subscribed to the relevant topics")


    publisher.publish("IQ", "This guy has 0 iq(Vitali).")
    publisher.publish("5EX", "I am not dumb ыыыыыы.")
    publisher.publish("IQ", "This guy has 400 iq(Pasha while pivo = true).")

    print("MAIN: Publisher sent all messages to broker")

    broker.sendMessage()

    print("End of main THREAD")

if __name__ == "__main__":
    main()