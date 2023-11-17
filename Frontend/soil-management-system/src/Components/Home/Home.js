import { useState } from 'react';

const Home = () => {
    const [name, setName] = useState('mario')

    // let name = 'mario'

    const handleClick = () => {
        setName('Luigi')
    }

    return ( 
        <div className="Home">
            <p>{name}</p>
            <h2>Home Page</h2>
            <button onClick = {handleClick}>Click Me</button>
        </div>  
     );
}
 
export default Home;