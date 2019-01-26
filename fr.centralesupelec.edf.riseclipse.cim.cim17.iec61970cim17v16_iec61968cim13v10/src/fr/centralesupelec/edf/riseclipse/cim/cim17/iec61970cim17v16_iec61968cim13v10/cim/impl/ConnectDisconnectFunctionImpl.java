/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect Disconnect Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getEventCount <em>Event Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsDelayedDiscon <em>Is Delayed Discon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getRcdInfo <em>Rcd Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectDisconnectFunctionImpl#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectDisconnectFunctionImpl extends EndDeviceFunctionImpl implements ConnectDisconnectFunction {
    /**
     * The default value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventCount()
     * @generated
     * @ordered
     */
    protected static final Integer EVENT_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventCount()
     * @generated
     * @ordered
     */
    protected Integer eventCount = EVENT_COUNT_EDEFAULT;

    /**
     * This is true if the Event Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eventCountESet;

    /**
     * The default value of the '{@link #getIsConnected() <em>Is Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsConnected()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_CONNECTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsConnected() <em>Is Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsConnected()
     * @generated
     * @ordered
     */
    protected Boolean isConnected = IS_CONNECTED_EDEFAULT;

    /**
     * This is true if the Is Connected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isConnectedESet;

    /**
     * The default value of the '{@link #getIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDelayedDiscon()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_DELAYED_DISCON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDelayedDiscon()
     * @generated
     * @ordered
     */
    protected Boolean isDelayedDiscon = IS_DELAYED_DISCON_EDEFAULT;

    /**
     * This is true if the Is Delayed Discon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isDelayedDisconESet;

    /**
     * The default value of the '{@link #getIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLocalAutoDisconOp()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_LOCAL_AUTO_DISCON_OP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLocalAutoDisconOp()
     * @generated
     * @ordered
     */
    protected Boolean isLocalAutoDisconOp = IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;

    /**
     * This is true if the Is Local Auto Discon Op attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isLocalAutoDisconOpESet;

    /**
     * The default value of the '{@link #getIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLocalAutoReconOp()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_LOCAL_AUTO_RECON_OP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsLocalAutoReconOp()
     * @generated
     * @ordered
     */
    protected Boolean isLocalAutoReconOp = IS_LOCAL_AUTO_RECON_OP_EDEFAULT;

    /**
     * This is true if the Is Local Auto Recon Op attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isLocalAutoReconOpESet;

    /**
     * The default value of the '{@link #getIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRemoteAutoDisconOp()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_REMOTE_AUTO_DISCON_OP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRemoteAutoDisconOp()
     * @generated
     * @ordered
     */
    protected Boolean isRemoteAutoDisconOp = IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;

    /**
     * This is true if the Is Remote Auto Discon Op attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isRemoteAutoDisconOpESet;

    /**
     * The default value of the '{@link #getIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRemoteAutoReconOp()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_REMOTE_AUTO_RECON_OP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsRemoteAutoReconOp()
     * @generated
     * @ordered
     */
    protected Boolean isRemoteAutoReconOp = IS_REMOTE_AUTO_RECON_OP_EDEFAULT;

    /**
     * This is true if the Is Remote Auto Recon Op attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isRemoteAutoReconOpESet;

    /**
     * The cached value of the '{@link #getRcdInfo() <em>Rcd Info</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcdInfo()
     * @generated
     * @ordered
     */
    protected RemoteConnectDisconnectInfo rcdInfo;

    /**
     * This is true if the Rcd Info containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcdInfoESet;

    /**
     * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitches()
     * @generated
     * @ordered
     */
    protected EList< Switch > switches;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectDisconnectFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConnectDisconnectFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getEventCount() {
        return eventCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEventCount( Integer newEventCount ) {
        Integer oldEventCount = eventCount;
        eventCount = newEventCount;
        boolean oldEventCountESet = eventCountESet;
        eventCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT, oldEventCount, eventCount, !oldEventCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEventCount() {
        Integer oldEventCount = eventCount;
        boolean oldEventCountESet = eventCountESet;
        eventCount = EVENT_COUNT_EDEFAULT;
        eventCountESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT,
                        oldEventCount, EVENT_COUNT_EDEFAULT, oldEventCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEventCount() {
        return eventCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsConnected() {
        return isConnected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsConnected( Boolean newIsConnected ) {
        Boolean oldIsConnected = isConnected;
        isConnected = newIsConnected;
        boolean oldIsConnectedESet = isConnectedESet;
        isConnectedESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED,
                        oldIsConnected, isConnected, !oldIsConnectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsConnected() {
        Boolean oldIsConnected = isConnected;
        boolean oldIsConnectedESet = isConnectedESet;
        isConnected = IS_CONNECTED_EDEFAULT;
        isConnectedESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED,
                        oldIsConnected, IS_CONNECTED_EDEFAULT, oldIsConnectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsConnected() {
        return isConnectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsDelayedDiscon() {
        return isDelayedDiscon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsDelayedDiscon( Boolean newIsDelayedDiscon ) {
        Boolean oldIsDelayedDiscon = isDelayedDiscon;
        isDelayedDiscon = newIsDelayedDiscon;
        boolean oldIsDelayedDisconESet = isDelayedDisconESet;
        isDelayedDisconESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON, oldIsDelayedDiscon, isDelayedDiscon,
                !oldIsDelayedDisconESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsDelayedDiscon() {
        Boolean oldIsDelayedDiscon = isDelayedDiscon;
        boolean oldIsDelayedDisconESet = isDelayedDisconESet;
        isDelayedDiscon = IS_DELAYED_DISCON_EDEFAULT;
        isDelayedDisconESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON, oldIsDelayedDiscon,
                IS_DELAYED_DISCON_EDEFAULT, oldIsDelayedDisconESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsDelayedDiscon() {
        return isDelayedDisconESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsLocalAutoDisconOp() {
        return isLocalAutoDisconOp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsLocalAutoDisconOp( Boolean newIsLocalAutoDisconOp ) {
        Boolean oldIsLocalAutoDisconOp = isLocalAutoDisconOp;
        isLocalAutoDisconOp = newIsLocalAutoDisconOp;
        boolean oldIsLocalAutoDisconOpESet = isLocalAutoDisconOpESet;
        isLocalAutoDisconOpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP, oldIsLocalAutoDisconOp,
                isLocalAutoDisconOp, !oldIsLocalAutoDisconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsLocalAutoDisconOp() {
        Boolean oldIsLocalAutoDisconOp = isLocalAutoDisconOp;
        boolean oldIsLocalAutoDisconOpESet = isLocalAutoDisconOpESet;
        isLocalAutoDisconOp = IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;
        isLocalAutoDisconOpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP, oldIsLocalAutoDisconOp,
                IS_LOCAL_AUTO_DISCON_OP_EDEFAULT, oldIsLocalAutoDisconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsLocalAutoDisconOp() {
        return isLocalAutoDisconOpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsLocalAutoReconOp() {
        return isLocalAutoReconOp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsLocalAutoReconOp( Boolean newIsLocalAutoReconOp ) {
        Boolean oldIsLocalAutoReconOp = isLocalAutoReconOp;
        isLocalAutoReconOp = newIsLocalAutoReconOp;
        boolean oldIsLocalAutoReconOpESet = isLocalAutoReconOpESet;
        isLocalAutoReconOpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP, oldIsLocalAutoReconOp,
                isLocalAutoReconOp, !oldIsLocalAutoReconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsLocalAutoReconOp() {
        Boolean oldIsLocalAutoReconOp = isLocalAutoReconOp;
        boolean oldIsLocalAutoReconOpESet = isLocalAutoReconOpESet;
        isLocalAutoReconOp = IS_LOCAL_AUTO_RECON_OP_EDEFAULT;
        isLocalAutoReconOpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP, oldIsLocalAutoReconOp,
                IS_LOCAL_AUTO_RECON_OP_EDEFAULT, oldIsLocalAutoReconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsLocalAutoReconOp() {
        return isLocalAutoReconOpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsRemoteAutoDisconOp() {
        return isRemoteAutoDisconOp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsRemoteAutoDisconOp( Boolean newIsRemoteAutoDisconOp ) {
        Boolean oldIsRemoteAutoDisconOp = isRemoteAutoDisconOp;
        isRemoteAutoDisconOp = newIsRemoteAutoDisconOp;
        boolean oldIsRemoteAutoDisconOpESet = isRemoteAutoDisconOpESet;
        isRemoteAutoDisconOpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP, oldIsRemoteAutoDisconOp,
                isRemoteAutoDisconOp, !oldIsRemoteAutoDisconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsRemoteAutoDisconOp() {
        Boolean oldIsRemoteAutoDisconOp = isRemoteAutoDisconOp;
        boolean oldIsRemoteAutoDisconOpESet = isRemoteAutoDisconOpESet;
        isRemoteAutoDisconOp = IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;
        isRemoteAutoDisconOpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP, oldIsRemoteAutoDisconOp,
                IS_REMOTE_AUTO_DISCON_OP_EDEFAULT, oldIsRemoteAutoDisconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsRemoteAutoDisconOp() {
        return isRemoteAutoDisconOpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsRemoteAutoReconOp() {
        return isRemoteAutoReconOp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsRemoteAutoReconOp( Boolean newIsRemoteAutoReconOp ) {
        Boolean oldIsRemoteAutoReconOp = isRemoteAutoReconOp;
        isRemoteAutoReconOp = newIsRemoteAutoReconOp;
        boolean oldIsRemoteAutoReconOpESet = isRemoteAutoReconOpESet;
        isRemoteAutoReconOpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP, oldIsRemoteAutoReconOp,
                isRemoteAutoReconOp, !oldIsRemoteAutoReconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsRemoteAutoReconOp() {
        Boolean oldIsRemoteAutoReconOp = isRemoteAutoReconOp;
        boolean oldIsRemoteAutoReconOpESet = isRemoteAutoReconOpESet;
        isRemoteAutoReconOp = IS_REMOTE_AUTO_RECON_OP_EDEFAULT;
        isRemoteAutoReconOpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP, oldIsRemoteAutoReconOp,
                IS_REMOTE_AUTO_RECON_OP_EDEFAULT, oldIsRemoteAutoReconOpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsRemoteAutoReconOp() {
        return isRemoteAutoReconOpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RemoteConnectDisconnectInfo getRcdInfo() {
        return rcdInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRcdInfo( RemoteConnectDisconnectInfo newRcdInfo, NotificationChain msgs ) {
        RemoteConnectDisconnectInfo oldRcdInfo = rcdInfo;
        rcdInfo = newRcdInfo;
        boolean oldRcdInfoESet = rcdInfoESet;
        rcdInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, oldRcdInfo, newRcdInfo, !oldRcdInfoESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRcdInfo( RemoteConnectDisconnectInfo newRcdInfo ) {
        if( newRcdInfo != rcdInfo ) {
            NotificationChain msgs = null;
            if( rcdInfo != null ) msgs = ( ( InternalEObject ) rcdInfo ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, msgs );
            if( newRcdInfo != null ) msgs = ( ( InternalEObject ) newRcdInfo ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, msgs );
            msgs = basicSetRcdInfo( newRcdInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRcdInfoESet = rcdInfoESet;
            rcdInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, newRcdInfo, newRcdInfo, !oldRcdInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRcdInfo( NotificationChain msgs ) {
        RemoteConnectDisconnectInfo oldRcdInfo = rcdInfo;
        rcdInfo = null;
        boolean oldRcdInfoESet = rcdInfoESet;
        rcdInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, oldRcdInfo, null, oldRcdInfoESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRcdInfo() {
        if( rcdInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) rcdInfo ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, msgs );
            msgs = basicUnsetRcdInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRcdInfoESet = rcdInfoESet;
            rcdInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, null, oldRcdInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRcdInfo() {
        return rcdInfoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Switch > getSwitches() {
        if( switches == null ) {
            switches = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Switch >( Switch.class, this,
                    CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES, CimPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS );
        }
        return switches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitches() {
        if( switches != null ) ( ( InternalEList.Unsettable< ? > ) switches ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitches() {
        return switches != null && ( ( InternalEList.Unsettable< ? > ) switches ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitches() ).basicAdd( otherEnd,
                    msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            return basicUnsetRcdInfo( msgs );
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            return ( ( InternalEList< ? > ) getSwitches() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
            return getEventCount();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
            return getIsConnected();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
            return getIsDelayedDiscon();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
            return getIsLocalAutoDisconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
            return getIsLocalAutoReconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
            return getIsRemoteAutoDisconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
            return getIsRemoteAutoReconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            return getRcdInfo();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            return getSwitches();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
            setEventCount( ( Integer ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
            setIsConnected( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
            setIsDelayedDiscon( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
            setIsLocalAutoDisconOp( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
            setIsLocalAutoReconOp( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
            setIsRemoteAutoDisconOp( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
            setIsRemoteAutoReconOp( ( Boolean ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            setRcdInfo( ( RemoteConnectDisconnectInfo ) newValue );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            getSwitches().clear();
            getSwitches().addAll( ( Collection< ? extends Switch > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
            unsetEventCount();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
            unsetIsConnected();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
            unsetIsDelayedDiscon();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
            unsetIsLocalAutoDisconOp();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
            unsetIsLocalAutoReconOp();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
            unsetIsRemoteAutoDisconOp();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
            unsetIsRemoteAutoReconOp();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            unsetRcdInfo();
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            unsetSwitches();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
            return isSetEventCount();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
            return isSetIsConnected();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
            return isSetIsDelayedDiscon();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
            return isSetIsLocalAutoDisconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
            return isSetIsLocalAutoReconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
            return isSetIsRemoteAutoDisconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
            return isSetIsRemoteAutoReconOp();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            return isSetRcdInfo();
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
            return isSetSwitches();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (eventCount: " );
        if( eventCountESet )
            result.append( eventCount );
        else
            result.append( "<unset>" );
        result.append( ", isConnected: " );
        if( isConnectedESet )
            result.append( isConnected );
        else
            result.append( "<unset>" );
        result.append( ", isDelayedDiscon: " );
        if( isDelayedDisconESet )
            result.append( isDelayedDiscon );
        else
            result.append( "<unset>" );
        result.append( ", isLocalAutoDisconOp: " );
        if( isLocalAutoDisconOpESet )
            result.append( isLocalAutoDisconOp );
        else
            result.append( "<unset>" );
        result.append( ", isLocalAutoReconOp: " );
        if( isLocalAutoReconOpESet )
            result.append( isLocalAutoReconOp );
        else
            result.append( "<unset>" );
        result.append( ", isRemoteAutoDisconOp: " );
        if( isRemoteAutoDisconOpESet )
            result.append( isRemoteAutoDisconOp );
        else
            result.append( "<unset>" );
        result.append( ", isRemoteAutoReconOp: " );
        if( isRemoteAutoReconOpESet )
            result.append( isRemoteAutoReconOp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ConnectDisconnectFunctionImpl
