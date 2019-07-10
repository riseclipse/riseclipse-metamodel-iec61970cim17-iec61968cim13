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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroConstIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1aIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Turbine Type1a IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenTurbineType1aIECImpl#getWindAeroConstIEC <em>Wind Aero Const IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenTurbineType1aIECImpl extends WindTurbineType1or2IECImpl implements WindGenTurbineType1aIEC {
    /**
     * The cached value of the '{@link #getWindAeroConstIEC() <em>Wind Aero Const IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindAeroConstIEC()
     * @generated
     * @ordered
     */
    protected WindAeroConstIEC windAeroConstIEC;

    /**
     * This is true if the Wind Aero Const IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windAeroConstIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenTurbineType1aIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenTurbineType1aIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroConstIEC getWindAeroConstIEC() {
        if( windAeroConstIEC != null && windAeroConstIEC.eIsProxy() ) {
            InternalEObject oldWindAeroConstIEC = ( InternalEObject ) windAeroConstIEC;
            windAeroConstIEC = ( WindAeroConstIEC ) eResolveProxy( oldWindAeroConstIEC );
            if( windAeroConstIEC != oldWindAeroConstIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, oldWindAeroConstIEC,
                        windAeroConstIEC ) );
            }
        }
        return windAeroConstIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindAeroConstIEC basicGetWindAeroConstIEC() {
        return windAeroConstIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindAeroConstIEC( WindAeroConstIEC newWindAeroConstIEC, NotificationChain msgs ) {
        WindAeroConstIEC oldWindAeroConstIEC = windAeroConstIEC;
        windAeroConstIEC = newWindAeroConstIEC;
        boolean oldWindAeroConstIECESet = windAeroConstIECESet;
        windAeroConstIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, oldWindAeroConstIEC,
                    newWindAeroConstIEC, !oldWindAeroConstIECESet );
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
    public void setWindAeroConstIEC( WindAeroConstIEC newWindAeroConstIEC ) {
        if( newWindAeroConstIEC != windAeroConstIEC ) {
            NotificationChain msgs = null;
            if( windAeroConstIEC != null ) msgs = ( ( InternalEObject ) windAeroConstIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, WindAeroConstIEC.class, msgs );
            if( newWindAeroConstIEC != null ) msgs = ( ( InternalEObject ) newWindAeroConstIEC ).eInverseAdd( this,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, WindAeroConstIEC.class, msgs );
            msgs = basicSetWindAeroConstIEC( newWindAeroConstIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroConstIECESet = windAeroConstIECESet;
            windAeroConstIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, newWindAeroConstIEC,
                    newWindAeroConstIEC, !oldWindAeroConstIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindAeroConstIEC( NotificationChain msgs ) {
        WindAeroConstIEC oldWindAeroConstIEC = windAeroConstIEC;
        windAeroConstIEC = null;
        boolean oldWindAeroConstIECESet = windAeroConstIECESet;
        windAeroConstIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, oldWindAeroConstIEC, null,
                    oldWindAeroConstIECESet );
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
    public void unsetWindAeroConstIEC() {
        if( windAeroConstIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windAeroConstIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, WindAeroConstIEC.class, msgs );
            msgs = basicUnsetWindAeroConstIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroConstIECESet = windAeroConstIECESet;
            windAeroConstIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, null, null,
                    oldWindAeroConstIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindAeroConstIEC() {
        return windAeroConstIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            if( windAeroConstIEC != null ) msgs = ( ( InternalEObject ) windAeroConstIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, WindAeroConstIEC.class, msgs );
            return basicSetWindAeroConstIEC( ( WindAeroConstIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            return basicUnsetWindAeroConstIEC( msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            if( resolve ) return getWindAeroConstIEC();
            return basicGetWindAeroConstIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            setWindAeroConstIEC( ( WindAeroConstIEC ) newValue );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            unsetWindAeroConstIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC:
            return isSetWindAeroConstIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindGenTurbineType1aIECImpl
