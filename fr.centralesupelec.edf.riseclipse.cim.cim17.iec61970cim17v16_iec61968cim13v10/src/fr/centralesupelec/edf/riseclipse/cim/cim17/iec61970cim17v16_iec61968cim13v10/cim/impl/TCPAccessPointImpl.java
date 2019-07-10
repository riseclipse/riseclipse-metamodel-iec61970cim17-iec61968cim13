/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCP Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TCPAccessPointImpl#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TCPAccessPointImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCPAccessPointImpl extends IPAccessPointImpl implements TCPAccessPoint {
    /**
     * The default value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
    protected static final Integer KEEP_ALIVE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKeepAliveTime() <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKeepAliveTime()
     * @generated
     * @ordered
     */
    protected Integer keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;

    /**
     * This is true if the Keep Alive Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keepAliveTimeESet;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected static final Integer PORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected Integer port = PORT_EDEFAULT;

    /**
     * This is true if the Port attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean portESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TCPAccessPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTCPAccessPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKeepAliveTime( Integer newKeepAliveTime ) {
        Integer oldKeepAliveTime = keepAliveTime;
        keepAliveTime = newKeepAliveTime;
        boolean oldKeepAliveTimeESet = keepAliveTimeESet;
        keepAliveTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME,
                    oldKeepAliveTime, keepAliveTime, !oldKeepAliveTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKeepAliveTime() {
        Integer oldKeepAliveTime = keepAliveTime;
        boolean oldKeepAliveTimeESet = keepAliveTimeESet;
        keepAliveTime = KEEP_ALIVE_TIME_EDEFAULT;
        keepAliveTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME,
                    oldKeepAliveTime, KEEP_ALIVE_TIME_EDEFAULT, oldKeepAliveTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKeepAliveTime() {
        return keepAliveTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPort( Integer newPort ) {
        Integer oldPort = port;
        port = newPort;
        boolean oldPortESet = portESet;
        portESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TCP_ACCESS_POINT__PORT, oldPort, port, !oldPortESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPort() {
        Integer oldPort = port;
        boolean oldPortESet = portESet;
        port = PORT_EDEFAULT;
        portESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TCP_ACCESS_POINT__PORT, oldPort, PORT_EDEFAULT, oldPortESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPort() {
        return portESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME:
            return getKeepAliveTime();
        case CimPackage.TCP_ACCESS_POINT__PORT:
            return getPort();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME:
            setKeepAliveTime( ( Integer ) newValue );
            return;
        case CimPackage.TCP_ACCESS_POINT__PORT:
            setPort( ( Integer ) newValue );
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
        case CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME:
            unsetKeepAliveTime();
            return;
        case CimPackage.TCP_ACCESS_POINT__PORT:
            unsetPort();
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
        case CimPackage.TCP_ACCESS_POINT__KEEP_ALIVE_TIME:
            return isSetKeepAliveTime();
        case CimPackage.TCP_ACCESS_POINT__PORT:
            return isSetPort();
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
        result.append( " (keepAliveTime: " );
        if( keepAliveTimeESet )
            result.append( keepAliveTime );
        else
            result.append( "<unset>" );
        result.append( ", port: " );
        if( portESet )
            result.append( port );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TCPAccessPointImpl
