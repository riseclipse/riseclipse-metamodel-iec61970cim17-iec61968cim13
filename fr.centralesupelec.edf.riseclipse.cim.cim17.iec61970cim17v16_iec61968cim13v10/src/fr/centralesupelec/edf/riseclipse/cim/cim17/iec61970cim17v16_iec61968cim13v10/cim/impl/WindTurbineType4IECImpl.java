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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3aIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type4 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType4IECImpl#getWindGenType3aIEC <em>Wind Gen Type3a IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType4IECImpl extends WindTurbineType3or4IECImpl implements WindTurbineType4IEC {
    /**
     * The cached value of the '{@link #getWindGenType3aIEC() <em>Wind Gen Type3a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenType3aIEC()
     * @generated
     * @ordered
     */
    protected WindGenType3aIEC windGenType3aIEC;

    /**
     * This is true if the Wind Gen Type3a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenType3aIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType4IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType4IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3aIEC getWindGenType3aIEC() {
        if( windGenType3aIEC != null && windGenType3aIEC.eIsProxy() ) {
            InternalEObject oldWindGenType3aIEC = ( InternalEObject ) windGenType3aIEC;
            windGenType3aIEC = ( WindGenType3aIEC ) eResolveProxy( oldWindGenType3aIEC );
            if( windGenType3aIEC != oldWindGenType3aIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, oldWindGenType3aIEC,
                        windGenType3aIEC ) );
            }
        }
        return windGenType3aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenType3aIEC basicGetWindGenType3aIEC() {
        return windGenType3aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenType3aIEC( WindGenType3aIEC newWindGenType3aIEC, NotificationChain msgs ) {
        WindGenType3aIEC oldWindGenType3aIEC = windGenType3aIEC;
        windGenType3aIEC = newWindGenType3aIEC;
        boolean oldWindGenType3aIECESet = windGenType3aIECESet;
        windGenType3aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, oldWindGenType3aIEC, newWindGenType3aIEC,
                    !oldWindGenType3aIECESet );
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
    public void setWindGenType3aIEC( WindGenType3aIEC newWindGenType3aIEC ) {
        if( newWindGenType3aIEC != windGenType3aIEC ) {
            NotificationChain msgs = null;
            if( windGenType3aIEC != null ) msgs = ( ( InternalEObject ) windGenType3aIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, WindGenType3aIEC.class, msgs );
            if( newWindGenType3aIEC != null ) msgs = ( ( InternalEObject ) newWindGenType3aIEC ).eInverseAdd( this,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, WindGenType3aIEC.class, msgs );
            msgs = basicSetWindGenType3aIEC( newWindGenType3aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3aIECESet = windGenType3aIECESet;
            windGenType3aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, newWindGenType3aIEC, newWindGenType3aIEC,
                    !oldWindGenType3aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenType3aIEC( NotificationChain msgs ) {
        WindGenType3aIEC oldWindGenType3aIEC = windGenType3aIEC;
        windGenType3aIEC = null;
        boolean oldWindGenType3aIECESet = windGenType3aIECESet;
        windGenType3aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, oldWindGenType3aIEC, null,
                    oldWindGenType3aIECESet );
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
    public void unsetWindGenType3aIEC() {
        if( windGenType3aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenType3aIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, WindGenType3aIEC.class, msgs );
            msgs = basicUnsetWindGenType3aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3aIECESet = windGenType3aIECESet;
            windGenType3aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, null, null, oldWindGenType3aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenType3aIEC() {
        return windGenType3aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            if( windGenType3aIEC != null ) msgs = ( ( InternalEObject ) windGenType3aIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, WindGenType3aIEC.class, msgs );
            return basicSetWindGenType3aIEC( ( WindGenType3aIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            return basicUnsetWindGenType3aIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            if( resolve ) return getWindGenType3aIEC();
            return basicGetWindGenType3aIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            setWindGenType3aIEC( ( WindGenType3aIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            unsetWindGenType3aIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC:
            return isSetWindGenType3aIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType4IECImpl
