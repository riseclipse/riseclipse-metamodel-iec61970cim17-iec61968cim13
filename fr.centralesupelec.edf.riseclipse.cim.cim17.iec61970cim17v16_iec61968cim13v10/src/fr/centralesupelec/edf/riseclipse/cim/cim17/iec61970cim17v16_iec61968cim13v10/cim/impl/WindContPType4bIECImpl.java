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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4bIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4bIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont PType4b IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4bIECImpl#getDpmaxp4b <em>Dpmaxp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4bIECImpl#getTpaero <em>Tpaero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4bIECImpl#getTpordp4b <em>Tpordp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4bIECImpl#getTufiltp4b <em>Tufiltp4b</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4bIECImpl#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType4bIECImpl extends IdentifiedObjectImpl implements WindContPType4bIEC {
    /**
     * The default value of the '{@link #getDpmaxp4b() <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmaxp4b()
     * @generated
     * @ordered
     */
    protected static final Float DPMAXP4B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmaxp4b() <em>Dpmaxp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmaxp4b()
     * @generated
     * @ordered
     */
    protected Float dpmaxp4b = DPMAXP4B_EDEFAULT;

    /**
     * This is true if the Dpmaxp4b attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxp4bESet;

    /**
     * The default value of the '{@link #getTpaero() <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpaero()
     * @generated
     * @ordered
     */
    protected static final Float TPAERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpaero() <em>Tpaero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpaero()
     * @generated
     * @ordered
     */
    protected Float tpaero = TPAERO_EDEFAULT;

    /**
     * This is true if the Tpaero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpaeroESet;

    /**
     * The default value of the '{@link #getTpordp4b() <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpordp4b()
     * @generated
     * @ordered
     */
    protected static final Float TPORDP4B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpordp4b() <em>Tpordp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpordp4b()
     * @generated
     * @ordered
     */
    protected Float tpordp4b = TPORDP4B_EDEFAULT;

    /**
     * This is true if the Tpordp4b attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpordp4bESet;

    /**
     * The default value of the '{@link #getTufiltp4b() <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp4b()
     * @generated
     * @ordered
     */
    protected static final Float TUFILTP4B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufiltp4b() <em>Tufiltp4b</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp4b()
     * @generated
     * @ordered
     */
    protected Float tufiltp4b = TUFILTP4B_EDEFAULT;

    /**
     * This is true if the Tufiltp4b attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltp4bESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4bIEC() <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4bIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4bIEC windTurbineType4bIEC;

    /**
     * This is true if the Wind Turbine Type4b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4bIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType4bIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType4bIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmaxp4b() {
        return dpmaxp4b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmaxp4b( Float newDpmaxp4b ) {
        Float oldDpmaxp4b = dpmaxp4b;
        dpmaxp4b = newDpmaxp4b;
        boolean oldDpmaxp4bESet = dpmaxp4bESet;
        dpmaxp4bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B, oldDpmaxp4b, dpmaxp4b, !oldDpmaxp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmaxp4b() {
        Float oldDpmaxp4b = dpmaxp4b;
        boolean oldDpmaxp4bESet = dpmaxp4bESet;
        dpmaxp4b = DPMAXP4B_EDEFAULT;
        dpmaxp4bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B, oldDpmaxp4b, DPMAXP4B_EDEFAULT, oldDpmaxp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmaxp4b() {
        return dpmaxp4bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpaero() {
        return tpaero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpaero( Float newTpaero ) {
        Float oldTpaero = tpaero;
        tpaero = newTpaero;
        boolean oldTpaeroESet = tpaeroESet;
        tpaeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO, oldTpaero, tpaero, !oldTpaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpaero() {
        Float oldTpaero = tpaero;
        boolean oldTpaeroESet = tpaeroESet;
        tpaero = TPAERO_EDEFAULT;
        tpaeroESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO, oldTpaero, TPAERO_EDEFAULT, oldTpaeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpaero() {
        return tpaeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpordp4b() {
        return tpordp4b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpordp4b( Float newTpordp4b ) {
        Float oldTpordp4b = tpordp4b;
        tpordp4b = newTpordp4b;
        boolean oldTpordp4bESet = tpordp4bESet;
        tpordp4bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B, oldTpordp4b, tpordp4b, !oldTpordp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpordp4b() {
        Float oldTpordp4b = tpordp4b;
        boolean oldTpordp4bESet = tpordp4bESet;
        tpordp4b = TPORDP4B_EDEFAULT;
        tpordp4bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B, oldTpordp4b, TPORDP4B_EDEFAULT, oldTpordp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpordp4b() {
        return tpordp4bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTufiltp4b() {
        return tufiltp4b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufiltp4b( Float newTufiltp4b ) {
        Float oldTufiltp4b = tufiltp4b;
        tufiltp4b = newTufiltp4b;
        boolean oldTufiltp4bESet = tufiltp4bESet;
        tufiltp4bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B, oldTufiltp4b, tufiltp4b, !oldTufiltp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufiltp4b() {
        Float oldTufiltp4b = tufiltp4b;
        boolean oldTufiltp4bESet = tufiltp4bESet;
        tufiltp4b = TUFILTP4B_EDEFAULT;
        tufiltp4bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B, oldTufiltp4b, TUFILTP4B_EDEFAULT, oldTufiltp4bESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufiltp4b() {
        return tufiltp4bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null && windTurbineType4bIEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType4bIEC = ( InternalEObject ) windTurbineType4bIEC;
            windTurbineType4bIEC = ( WindTurbineType4bIEC ) eResolveProxy( oldWindTurbineType4bIEC );
            if( windTurbineType4bIEC != oldWindTurbineType4bIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                        windTurbineType4bIEC ) );
            }
        }
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType4bIEC basicGetWindTurbineType4bIEC() {
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC,
            NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = newWindTurbineType4bIEC;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                    newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet );
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
    public void setWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC ) {
        if( newWindTurbineType4bIEC != windTurbineType4bIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4bIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            if( newWindTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4bIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicSetWindTurbineType4bIEC( newWindTurbineType4bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, newWindTurbineType4bIEC,
                    newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4bIEC( NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = null;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC, null,
                    oldWindTurbineType4bIECESet );
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
    public void unsetWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC, null, null,
                    oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4bIEC() {
        return windTurbineType4bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( windTurbineType4bIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_CONT_PTYPE4B_IEC, WindTurbineType4bIEC.class, msgs );
            return basicSetWindTurbineType4bIEC( ( WindTurbineType4bIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            return basicUnsetWindTurbineType4bIEC( msgs );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B:
            return getDpmaxp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            return getTpaero();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B:
            return getTpordp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B:
            return getTufiltp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( resolve ) return getWindTurbineType4bIEC();
            return basicGetWindTurbineType4bIEC();
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B:
            setDpmaxp4b( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            setTpaero( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B:
            setTpordp4b( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B:
            setTufiltp4b( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            setWindTurbineType4bIEC( ( WindTurbineType4bIEC ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B:
            unsetDpmaxp4b();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            unsetTpaero();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B:
            unsetTpordp4b();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B:
            unsetTufiltp4b();
            return;
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            unsetWindTurbineType4bIEC();
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
        case CimPackage.WIND_CONT_PTYPE4B_IEC__DPMAXP4B:
            return isSetDpmaxp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPAERO:
            return isSetTpaero();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TPORDP4B:
            return isSetTpordp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__TUFILTP4B:
            return isSetTufiltp4b();
        case CimPackage.WIND_CONT_PTYPE4B_IEC__WIND_TURBINE_TYPE4B_IEC:
            return isSetWindTurbineType4bIEC();
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
        result.append( " (dpmaxp4b: " );
        if( dpmaxp4bESet )
            result.append( dpmaxp4b );
        else
            result.append( "<unset>" );
        result.append( ", tpaero: " );
        if( tpaeroESet )
            result.append( tpaero );
        else
            result.append( "<unset>" );
        result.append( ", tpordp4b: " );
        if( tpordp4bESet )
            result.append( tpordp4b );
        else
            result.append( "<unset>" );
        result.append( ", tufiltp4b: " );
        if( tufiltp4bESet )
            result.append( tufiltp4b );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPType4bIECImpl
