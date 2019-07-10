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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenTurbineType1bIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPitchContPowerIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Turbine Type1b IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenTurbineType1bIECImpl#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenTurbineType1bIECImpl extends WindTurbineType1or2IECImpl implements WindGenTurbineType1bIEC {
    /**
     * The cached value of the '{@link #getWindPitchContPowerIEC() <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPitchContPowerIEC()
     * @generated
     * @ordered
     */
    protected WindPitchContPowerIEC windPitchContPowerIEC;

    /**
     * This is true if the Wind Pitch Cont Power IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPitchContPowerIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenTurbineType1bIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenTurbineType1bIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPitchContPowerIEC getWindPitchContPowerIEC() {
        if( windPitchContPowerIEC != null && windPitchContPowerIEC.eIsProxy() ) {
            InternalEObject oldWindPitchContPowerIEC = ( InternalEObject ) windPitchContPowerIEC;
            windPitchContPowerIEC = ( WindPitchContPowerIEC ) eResolveProxy( oldWindPitchContPowerIEC );
            if( windPitchContPowerIEC != oldWindPitchContPowerIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, oldWindPitchContPowerIEC,
                        windPitchContPowerIEC ) );
            }
        }
        return windPitchContPowerIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPitchContPowerIEC basicGetWindPitchContPowerIEC() {
        return windPitchContPowerIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPitchContPowerIEC( WindPitchContPowerIEC newWindPitchContPowerIEC,
            NotificationChain msgs ) {
        WindPitchContPowerIEC oldWindPitchContPowerIEC = windPitchContPowerIEC;
        windPitchContPowerIEC = newWindPitchContPowerIEC;
        boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
        windPitchContPowerIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, oldWindPitchContPowerIEC,
                    newWindPitchContPowerIEC, !oldWindPitchContPowerIECESet );
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
    public void setWindPitchContPowerIEC( WindPitchContPowerIEC newWindPitchContPowerIEC ) {
        if( newWindPitchContPowerIEC != windPitchContPowerIEC ) {
            NotificationChain msgs = null;
            if( windPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, WindPitchContPowerIEC.class,
                        msgs );
            if( newWindPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) newWindPitchContPowerIEC ).eInverseAdd( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, WindPitchContPowerIEC.class,
                        msgs );
            msgs = basicSetWindPitchContPowerIEC( newWindPitchContPowerIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
            windPitchContPowerIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, newWindPitchContPowerIEC,
                    newWindPitchContPowerIEC, !oldWindPitchContPowerIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPitchContPowerIEC( NotificationChain msgs ) {
        WindPitchContPowerIEC oldWindPitchContPowerIEC = windPitchContPowerIEC;
        windPitchContPowerIEC = null;
        boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
        windPitchContPowerIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, oldWindPitchContPowerIEC, null,
                    oldWindPitchContPowerIECESet );
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
    public void unsetWindPitchContPowerIEC() {
        if( windPitchContPowerIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                    CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, WindPitchContPowerIEC.class,
                    msgs );
            msgs = basicUnsetWindPitchContPowerIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPitchContPowerIECESet = windPitchContPowerIECESet;
            windPitchContPowerIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC, null, null,
                    oldWindPitchContPowerIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPitchContPowerIEC() {
        return windPitchContPowerIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            if( windPitchContPowerIEC != null )
                msgs = ( ( InternalEObject ) windPitchContPowerIEC ).eInverseRemove( this,
                        CimPackage.WIND_PITCH_CONT_POWER_IEC__WIND_GEN_TURBINE_TYPE1B_IEC, WindPitchContPowerIEC.class,
                        msgs );
            return basicSetWindPitchContPowerIEC( ( WindPitchContPowerIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            return basicUnsetWindPitchContPowerIEC( msgs );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            if( resolve ) return getWindPitchContPowerIEC();
            return basicGetWindPitchContPowerIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            setWindPitchContPowerIEC( ( WindPitchContPowerIEC ) newValue );
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            unsetWindPitchContPowerIEC();
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
        case CimPackage.WIND_GEN_TURBINE_TYPE1B_IEC__WIND_PITCH_CONT_POWER_IEC:
            return isSetWindPitchContPowerIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindGenTurbineType1bIECImpl
