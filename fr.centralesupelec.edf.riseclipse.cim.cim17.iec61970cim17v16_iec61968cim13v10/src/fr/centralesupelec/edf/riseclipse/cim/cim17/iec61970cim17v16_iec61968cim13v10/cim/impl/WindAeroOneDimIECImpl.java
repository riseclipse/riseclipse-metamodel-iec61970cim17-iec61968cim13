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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroOneDimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Aero One Dim IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroOneDimIECImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroOneDimIECImpl#getThetaomega <em>Thetaomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroOneDimIECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindAeroOneDimIECImpl extends IdentifiedObjectImpl implements WindAeroOneDimIEC {
    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Float KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Float ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getThetaomega() <em>Thetaomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaomega()
     * @generated
     * @ordered
     */
    protected static final Float THETAOMEGA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetaomega() <em>Thetaomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaomega()
     * @generated
     * @ordered
     */
    protected Float thetaomega = THETAOMEGA_EDEFAULT;

    /**
     * This is true if the Thetaomega attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetaomegaESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindAeroOneDimIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindAeroOneDimIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Float newKa ) {
        Float oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_ONE_DIM_IEC__KA, oldKa, ka, !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Float oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_ONE_DIM_IEC__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetaomega() {
        return thetaomega;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetaomega( Float newThetaomega ) {
        Float oldThetaomega = thetaomega;
        thetaomega = newThetaomega;
        boolean oldThetaomegaESet = thetaomegaESet;
        thetaomegaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA, oldThetaomega, thetaomega, !oldThetaomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetaomega() {
        Float oldThetaomega = thetaomega;
        boolean oldThetaomegaESet = thetaomegaESet;
        thetaomega = THETAOMEGA_EDEFAULT;
        thetaomegaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA, oldThetaomega, THETAOMEGA_EDEFAULT, oldThetaomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetaomega() {
        return thetaomegaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet );
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
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
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
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, null, null,
                    oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, WindTurbineType3IEC.class, msgs );
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
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
        case CimPackage.WIND_AERO_ONE_DIM_IEC__KA:
            return getKa();
        case CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA:
            return getThetaomega();
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return getWindTurbineType3IEC();
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
        case CimPackage.WIND_AERO_ONE_DIM_IEC__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA:
            setThetaomega( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
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
        case CimPackage.WIND_AERO_ONE_DIM_IEC__KA:
            unsetKa();
            return;
        case CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA:
            unsetThetaomega();
            return;
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
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
        case CimPackage.WIND_AERO_ONE_DIM_IEC__KA:
            return isSetKa();
        case CimPackage.WIND_AERO_ONE_DIM_IEC__THETAOMEGA:
            return isSetThetaomega();
        case CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
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
        result.append( " (ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", thetaomega: " );
        if( thetaomegaESet )
            result.append( thetaomega );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindAeroOneDimIECImpl
