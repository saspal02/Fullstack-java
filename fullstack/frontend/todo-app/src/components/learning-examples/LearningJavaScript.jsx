import React from 'react';
const person = {
    name: 'Ranga Karanam',
    address: {
        line1: 'Baker Street',
        city: 'London',
        country: 'UK',
    },
    profiles: ['twitter', 'linkedin', 'instagram'],
};

export default function LearningJavaScript() {
    return (
        <React.Fragment>
            <div>{person.name}</div>
            <div>{person.address.line1}</div>
            <div>{person.profiles[0]}</div>
            <div>
                {person.profiles.map((profile, index) => (
                    <div key={index}>{profile}</div>
                ))}
            </div>
        </React.Fragment>
    );
}
