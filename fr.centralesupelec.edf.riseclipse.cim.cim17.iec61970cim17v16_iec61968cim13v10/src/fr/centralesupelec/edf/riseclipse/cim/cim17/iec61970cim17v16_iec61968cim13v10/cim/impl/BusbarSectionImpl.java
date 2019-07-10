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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BusbarSectionImpl#getIpMax <em>Ip Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BusbarSectionImpl#getVoltageControlZone <em>Voltage Control Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusbarSectionImpl extends ConnectorImpl implements BusbarSection {
    /**
     * The default value of the '{@link #getIpMax() <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIpMax()
     * @generated
     * @ordered
     */
    protected static final Float IP_MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIpMax() <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIpMax()
     * @generated
     * @ordered
     */
    protected Float ipMax = IP_MAX_EDEFAULT;

    /**
     * This is true if the Ip Max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ipMaxESet;

    /**
     * The cached value of the '{@link #getVoltageControlZone() <em>Voltage Control Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageControlZone()
     * @generated
     * @ordered
     */
    protected VoltageControlZone voltageControlZone;

    /**
     * This is true if the Voltage Control Zone reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageControlZoneESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusbarSectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBusbarSection();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIpMax() {
        return ipMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIpMax( Float newIpMax ) {
        Float oldIpMax = ipMax;
        ipMax = newIpMax;
        boolean oldIpMaxESet = ipMaxESet;
        ipMaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSBAR_SECTION__IP_MAX, oldIpMax, ipMax, !oldIpMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIpMax() {
        Float oldIpMax = ipMax;
        boolean oldIpMaxESet = ipMaxESet;
        ipMax = IP_MAX_EDEFAULT;
        ipMaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BUSBAR_SECTION__IP_MAX, oldIpMax, IP_MAX_EDEFAULT, oldIpMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIpMax() {
        return ipMaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageControlZone getVoltageControlZone() {
        if( voltageControlZone != null && voltageControlZone.eIsProxy() ) {
            InternalEObject oldVoltageControlZone = ( InternalEObject ) voltageControlZone;
            voltageControlZone = ( VoltageControlZone ) eResolveProxy( oldVoltageControlZone );
            if( voltageControlZone != oldVoltageControlZone ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, oldVoltageControlZone, voltageControlZone ) );
            }
        }
        return voltageControlZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VoltageControlZone basicGetVoltageControlZone() {
        return voltageControlZone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageControlZone( VoltageControlZone newVoltageControlZone,
            NotificationChain msgs ) {
        VoltageControlZone oldVoltageControlZone = voltageControlZone;
        voltageControlZone = newVoltageControlZone;
        boolean oldVoltageControlZoneESet = voltageControlZoneESet;
        voltageControlZoneESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, oldVoltageControlZone, newVoltageControlZone,
                    !oldVoltageControlZoneESet );
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
    public void setVoltageControlZone( VoltageControlZone newVoltageControlZone ) {
        if( newVoltageControlZone != voltageControlZone ) {
            NotificationChain msgs = null;
            if( voltageControlZone != null ) msgs = ( ( InternalEObject ) voltageControlZone ).eInverseRemove( this,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs );
            if( newVoltageControlZone != null ) msgs = ( ( InternalEObject ) newVoltageControlZone ).eInverseAdd( this,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs );
            msgs = basicSetVoltageControlZone( newVoltageControlZone, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageControlZoneESet = voltageControlZoneESet;
            voltageControlZoneESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE,
                        newVoltageControlZone, newVoltageControlZone, !oldVoltageControlZoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageControlZone( NotificationChain msgs ) {
        VoltageControlZone oldVoltageControlZone = voltageControlZone;
        voltageControlZone = null;
        boolean oldVoltageControlZoneESet = voltageControlZoneESet;
        voltageControlZoneESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, oldVoltageControlZone, null,
                    oldVoltageControlZoneESet );
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
    public void unsetVoltageControlZone() {
        if( voltageControlZone != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageControlZone ).eInverseRemove( this,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs );
            msgs = basicUnsetVoltageControlZone( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageControlZoneESet = voltageControlZoneESet;
            voltageControlZoneESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, null, null, oldVoltageControlZoneESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageControlZone() {
        return voltageControlZoneESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            if( voltageControlZone != null ) msgs = ( ( InternalEObject ) voltageControlZone ).eInverseRemove( this,
                    CimPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs );
            return basicSetVoltageControlZone( ( VoltageControlZone ) otherEnd, msgs );
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
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            return basicUnsetVoltageControlZone( msgs );
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
        case CimPackage.BUSBAR_SECTION__IP_MAX:
            return getIpMax();
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            if( resolve ) return getVoltageControlZone();
            return basicGetVoltageControlZone();
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
        case CimPackage.BUSBAR_SECTION__IP_MAX:
            setIpMax( ( Float ) newValue );
            return;
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            setVoltageControlZone( ( VoltageControlZone ) newValue );
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
        case CimPackage.BUSBAR_SECTION__IP_MAX:
            unsetIpMax();
            return;
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            unsetVoltageControlZone();
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
        case CimPackage.BUSBAR_SECTION__IP_MAX:
            return isSetIpMax();
        case CimPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
            return isSetVoltageControlZone();
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
        result.append( " (ipMax: " );
        if( ipMaxESet )
            result.append( ipMax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BusbarSectionImpl
