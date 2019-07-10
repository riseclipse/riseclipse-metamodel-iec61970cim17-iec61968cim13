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
 * An implementation of the model object '<em><b>Wind Aero Const IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroConstIECImpl#getWindGenTurbineType1aIEC <em>Wind Gen Turbine Type1a IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindAeroConstIECImpl extends IdentifiedObjectImpl implements WindAeroConstIEC {
    /**
     * The cached value of the '{@link #getWindGenTurbineType1aIEC() <em>Wind Gen Turbine Type1a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenTurbineType1aIEC()
     * @generated
     * @ordered
     */
    protected WindGenTurbineType1aIEC windGenTurbineType1aIEC;

    /**
     * This is true if the Wind Gen Turbine Type1a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenTurbineType1aIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindAeroConstIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindAeroConstIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenTurbineType1aIEC getWindGenTurbineType1aIEC() {
        return windGenTurbineType1aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenTurbineType1aIEC( WindGenTurbineType1aIEC newWindGenTurbineType1aIEC,
            NotificationChain msgs ) {
        WindGenTurbineType1aIEC oldWindGenTurbineType1aIEC = windGenTurbineType1aIEC;
        windGenTurbineType1aIEC = newWindGenTurbineType1aIEC;
        boolean oldWindGenTurbineType1aIECESet = windGenTurbineType1aIECESet;
        windGenTurbineType1aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, oldWindGenTurbineType1aIEC,
                    newWindGenTurbineType1aIEC, !oldWindGenTurbineType1aIECESet );
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
    public void setWindGenTurbineType1aIEC( WindGenTurbineType1aIEC newWindGenTurbineType1aIEC ) {
        if( newWindGenTurbineType1aIEC != windGenTurbineType1aIEC ) {
            NotificationChain msgs = null;
            if( windGenTurbineType1aIEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1aIEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1aIEC.class,
                        msgs );
            if( newWindGenTurbineType1aIEC != null )
                msgs = ( ( InternalEObject ) newWindGenTurbineType1aIEC ).eInverseAdd( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1aIEC.class,
                        msgs );
            msgs = basicSetWindGenTurbineType1aIEC( newWindGenTurbineType1aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1aIECESet = windGenTurbineType1aIECESet;
            windGenTurbineType1aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, newWindGenTurbineType1aIEC,
                    newWindGenTurbineType1aIEC, !oldWindGenTurbineType1aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenTurbineType1aIEC( NotificationChain msgs ) {
        WindGenTurbineType1aIEC oldWindGenTurbineType1aIEC = windGenTurbineType1aIEC;
        windGenTurbineType1aIEC = null;
        boolean oldWindGenTurbineType1aIECESet = windGenTurbineType1aIECESet;
        windGenTurbineType1aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, oldWindGenTurbineType1aIEC, null,
                    oldWindGenTurbineType1aIECESet );
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
    public void unsetWindGenTurbineType1aIEC() {
        if( windGenTurbineType1aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenTurbineType1aIEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1aIEC.class, msgs );
            msgs = basicUnsetWindGenTurbineType1aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenTurbineType1aIECESet = windGenTurbineType1aIECESet;
            windGenTurbineType1aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC, null, null,
                    oldWindGenTurbineType1aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenTurbineType1aIEC() {
        return windGenTurbineType1aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            if( windGenTurbineType1aIEC != null )
                msgs = ( ( InternalEObject ) windGenTurbineType1aIEC ).eInverseRemove( this,
                        CimPackage.WIND_GEN_TURBINE_TYPE1A_IEC__WIND_AERO_CONST_IEC, WindGenTurbineType1aIEC.class,
                        msgs );
            return basicSetWindGenTurbineType1aIEC( ( WindGenTurbineType1aIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            return basicUnsetWindGenTurbineType1aIEC( msgs );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            return getWindGenTurbineType1aIEC();
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            setWindGenTurbineType1aIEC( ( WindGenTurbineType1aIEC ) newValue );
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            unsetWindGenTurbineType1aIEC();
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
        case CimPackage.WIND_AERO_CONST_IEC__WIND_GEN_TURBINE_TYPE1A_IEC:
            return isSetWindGenTurbineType1aIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindAeroConstIECImpl
