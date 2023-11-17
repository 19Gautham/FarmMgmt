import React from 'react';

const Footer = () => {
    const recentEvents = [
        { id: 1, type: 'Alert', message: 'Temperature spike detected.' },
        { id: 2, type: 'Notification', message: 'New crops planted.' },
        // Add more events
      ];

    return (
        <div>
            
            <div className="quick-stats">
                <p>Total Crops: 50</p>
                <p>Soil Moisture: 65%</p>
            </div>
            
            <div className="recent-events">
                <h3>Recent Events</h3>
                <ul>
                    {recentEvents.map((event) => (
                        <li key={event.id}>
                            <strong>{event.type}:</strong> {event.message}
                        </li>
                    ))}
                </ul>
            </div>
        
        </div>
    );
}

export default Footer
