import './TopBar.css'
import ConnectMeLogo from './ConnectMeLogo.js'

function TopBar() {

    return(
        <div className='TopBar'>
            <ConnectMeLogo />
            <button className='my-button'>Chats</button>
            <button className='my-button'>People</button>
        </div>

    );
}

export default TopBar;