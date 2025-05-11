package com.example.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LoadBalancer {

    @Override
    public String toString() {
        return "LoadBalancer{" +
                "servers=" + servers +
                '}';
    }

    private List<Server> servers;

    public LoadBalancer() {
        servers = new ArrayList<>();
    }

    // Method to add servers to the load balancer
    public void addServer(String ipAddress, int currentLoad) {
        servers.add(new Server(ipAddress, currentLoad));
    }

    // Method to get the next server IP address using minimum-load strategy
    public String getNextServer() {
        if (servers.isEmpty()) {
            throw new IllegalStateException("No servers available in the load balancer.");
        }

        Server minLoadServer = servers.get(0);
//        for (Server server : servers) {
//            if (server.getCurrentLoad() < minLoadServer.getCurrentLoad()) {
//                minLoadServer = server;
//            }
//        }

        servers.sort(Comparator.comparing(Server::getCurrentLoad));
//
        minLoadServer = servers.get(0);

        // Increment the load of the selected server
        minLoadServer.incrementLoad();

        return minLoadServer.getIpAddress();
    }


    public static void main(String[] args) {
        LoadBalancer loadBalancer = new LoadBalancer();

        // Add some dummy server IP addresses and loads
        loadBalancer.addServer("192.168.1.10", 10);
        loadBalancer.addServer("192.168.1.11", 10);
        loadBalancer.addServer("192.168.1.12", 10);

        // Retrieve the next server for routing requests
        String ipAddress1 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress1);
        System.out.println(loadBalancer);

        String ipAddress2 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress2);
        System.out.println(loadBalancer);

        String ipAddress3 = loadBalancer.getNextServer();
        System.out.println("Request routed to server: " + ipAddress3);
        System.out.println(loadBalancer);
    }
}
