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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsConnection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerElectronicsUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Electronics Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsUnitImpl#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsUnitImpl#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerElectronicsUnitImpl#getPowerElectronicsConnection <em>Power Electronics Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerElectronicsUnitImpl extends EquipmentImpl implements PowerElectronicsUnit {
    /**
     * The default value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxP() <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxP()
     * @generated
     * @ordered
     */
    protected Float maxP = MAX_P_EDEFAULT;

    /**
     * This is true if the Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxPESet;

    /**
     * The default value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinP() <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinP()
     * @generated
     * @ordered
     */
    protected Float minP = MIN_P_EDEFAULT;

    /**
     * This is true if the Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minPESet;

    /**
     * The cached value of the '{@link #getPowerElectronicsConnection() <em>Power Electronics Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerElectronicsConnection()
     * @generated
     * @ordered
     */
    protected PowerElectronicsConnection powerElectronicsConnection;

    /**
     * This is true if the Power Electronics Connection reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerElectronicsConnectionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerElectronicsUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerElectronicsUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxP() {
        return maxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxP( Float newMaxP ) {
        Float oldMaxP = maxP;
        maxP = newMaxP;
        boolean oldMaxPESet = maxPESet;
        maxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_UNIT__MAX_P, oldMaxP, maxP, !oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxP() {
        Float oldMaxP = maxP;
        boolean oldMaxPESet = maxPESet;
        maxP = MAX_P_EDEFAULT;
        maxPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_UNIT__MAX_P, oldMaxP, MAX_P_EDEFAULT, oldMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxP() {
        return maxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinP() {
        return minP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinP( Float newMinP ) {
        Float oldMinP = minP;
        minP = newMinP;
        boolean oldMinPESet = minPESet;
        minPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_ELECTRONICS_UNIT__MIN_P, oldMinP, minP, !oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinP() {
        Float oldMinP = minP;
        boolean oldMinPESet = minPESet;
        minP = MIN_P_EDEFAULT;
        minPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_ELECTRONICS_UNIT__MIN_P, oldMinP, MIN_P_EDEFAULT, oldMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinP() {
        return minPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerElectronicsConnection getPowerElectronicsConnection() {
        return powerElectronicsConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerElectronicsConnection(
            PowerElectronicsConnection newPowerElectronicsConnection, NotificationChain msgs ) {
        PowerElectronicsConnection oldPowerElectronicsConnection = powerElectronicsConnection;
        powerElectronicsConnection = newPowerElectronicsConnection;
        boolean oldPowerElectronicsConnectionESet = powerElectronicsConnectionESet;
        powerElectronicsConnectionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, oldPowerElectronicsConnection,
                    newPowerElectronicsConnection, !oldPowerElectronicsConnectionESet );
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
    public void setPowerElectronicsConnection( PowerElectronicsConnection newPowerElectronicsConnection ) {
        if( newPowerElectronicsConnection != powerElectronicsConnection ) {
            NotificationChain msgs = null;
            if( powerElectronicsConnection != null )
                msgs = ( ( InternalEObject ) powerElectronicsConnection ).eInverseRemove( this,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT,
                        PowerElectronicsConnection.class, msgs );
            if( newPowerElectronicsConnection != null )
                msgs = ( ( InternalEObject ) newPowerElectronicsConnection ).eInverseAdd( this,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT,
                        PowerElectronicsConnection.class, msgs );
            msgs = basicSetPowerElectronicsConnection( newPowerElectronicsConnection, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerElectronicsConnectionESet = powerElectronicsConnectionESet;
            powerElectronicsConnectionESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, newPowerElectronicsConnection,
                    newPowerElectronicsConnection, !oldPowerElectronicsConnectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerElectronicsConnection( NotificationChain msgs ) {
        PowerElectronicsConnection oldPowerElectronicsConnection = powerElectronicsConnection;
        powerElectronicsConnection = null;
        boolean oldPowerElectronicsConnectionESet = powerElectronicsConnectionESet;
        powerElectronicsConnectionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, oldPowerElectronicsConnection,
                    null, oldPowerElectronicsConnectionESet );
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
    public void unsetPowerElectronicsConnection() {
        if( powerElectronicsConnection != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerElectronicsConnection ).eInverseRemove( this,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT, PowerElectronicsConnection.class,
                    msgs );
            msgs = basicUnsetPowerElectronicsConnection( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerElectronicsConnectionESet = powerElectronicsConnectionESet;
            powerElectronicsConnectionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, null, null,
                    oldPowerElectronicsConnectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerElectronicsConnection() {
        return powerElectronicsConnectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            if( powerElectronicsConnection != null )
                msgs = ( ( InternalEObject ) powerElectronicsConnection ).eInverseRemove( this,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT,
                        PowerElectronicsConnection.class, msgs );
            return basicSetPowerElectronicsConnection( ( PowerElectronicsConnection ) otherEnd, msgs );
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
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            return basicUnsetPowerElectronicsConnection( msgs );
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
        case CimPackage.POWER_ELECTRONICS_UNIT__MAX_P:
            return getMaxP();
        case CimPackage.POWER_ELECTRONICS_UNIT__MIN_P:
            return getMinP();
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            return getPowerElectronicsConnection();
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
        case CimPackage.POWER_ELECTRONICS_UNIT__MAX_P:
            setMaxP( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_UNIT__MIN_P:
            setMinP( ( Float ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            setPowerElectronicsConnection( ( PowerElectronicsConnection ) newValue );
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
        case CimPackage.POWER_ELECTRONICS_UNIT__MAX_P:
            unsetMaxP();
            return;
        case CimPackage.POWER_ELECTRONICS_UNIT__MIN_P:
            unsetMinP();
            return;
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            unsetPowerElectronicsConnection();
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
        case CimPackage.POWER_ELECTRONICS_UNIT__MAX_P:
            return isSetMaxP();
        case CimPackage.POWER_ELECTRONICS_UNIT__MIN_P:
            return isSetMinP();
        case CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION:
            return isSetPowerElectronicsConnection();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (maxP: " );
        if( maxPESet )
            result.append( maxP );
        else
            result.append( "<unset>" );
        result.append( ", minP: " );
        if( minPESet )
            result.append( minP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerElectronicsUnitImpl
