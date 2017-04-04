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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4aIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont PType4a IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4aIECImpl#getDpmaxp4a <em>Dpmaxp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4aIECImpl#getTpordp4a <em>Tpordp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4aIECImpl#getTufiltp4a <em>Tufiltp4a</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType4aIECImpl#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType4aIECImpl extends IdentifiedObjectImpl implements WindContPType4aIEC {
    /**
     * The default value of the '{@link #getDpmaxp4a() <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmaxp4a()
     * @generated
     * @ordered
     */
    protected static final Float DPMAXP4A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmaxp4a() <em>Dpmaxp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmaxp4a()
     * @generated
     * @ordered
     */
    protected Float dpmaxp4a = DPMAXP4A_EDEFAULT;

    /**
     * This is true if the Dpmaxp4a attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxp4aESet;

    /**
     * The default value of the '{@link #getTpordp4a() <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpordp4a()
     * @generated
     * @ordered
     */
    protected static final Float TPORDP4A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpordp4a() <em>Tpordp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpordp4a()
     * @generated
     * @ordered
     */
    protected Float tpordp4a = TPORDP4A_EDEFAULT;

    /**
     * This is true if the Tpordp4a attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpordp4aESet;

    /**
     * The default value of the '{@link #getTufiltp4a() <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp4a()
     * @generated
     * @ordered
     */
    protected static final Float TUFILTP4A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufiltp4a() <em>Tufiltp4a</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp4a()
     * @generated
     * @ordered
     */
    protected Float tufiltp4a = TUFILTP4A_EDEFAULT;

    /**
     * This is true if the Tufiltp4a attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltp4aESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4aIEC() <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4aIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4aIEC windTurbineType4aIEC;

    /**
     * This is true if the Wind Turbine Type4a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4aIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType4aIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType4aIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmaxp4a() {
        return dpmaxp4a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmaxp4a( Float newDpmaxp4a ) {
        Float oldDpmaxp4a = dpmaxp4a;
        dpmaxp4a = newDpmaxp4a;
        boolean oldDpmaxp4aESet = dpmaxp4aESet;
        dpmaxp4aESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A, oldDpmaxp4a, dpmaxp4a, !oldDpmaxp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmaxp4a() {
        Float oldDpmaxp4a = dpmaxp4a;
        boolean oldDpmaxp4aESet = dpmaxp4aESet;
        dpmaxp4a = DPMAXP4A_EDEFAULT;
        dpmaxp4aESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A, oldDpmaxp4a, DPMAXP4A_EDEFAULT, oldDpmaxp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmaxp4a() {
        return dpmaxp4aESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpordp4a() {
        return tpordp4a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpordp4a( Float newTpordp4a ) {
        Float oldTpordp4a = tpordp4a;
        tpordp4a = newTpordp4a;
        boolean oldTpordp4aESet = tpordp4aESet;
        tpordp4aESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A, oldTpordp4a, tpordp4a, !oldTpordp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpordp4a() {
        Float oldTpordp4a = tpordp4a;
        boolean oldTpordp4aESet = tpordp4aESet;
        tpordp4a = TPORDP4A_EDEFAULT;
        tpordp4aESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A, oldTpordp4a, TPORDP4A_EDEFAULT, oldTpordp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpordp4a() {
        return tpordp4aESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTufiltp4a() {
        return tufiltp4a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufiltp4a( Float newTufiltp4a ) {
        Float oldTufiltp4a = tufiltp4a;
        tufiltp4a = newTufiltp4a;
        boolean oldTufiltp4aESet = tufiltp4aESet;
        tufiltp4aESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A, oldTufiltp4a, tufiltp4a, !oldTufiltp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufiltp4a() {
        Float oldTufiltp4a = tufiltp4a;
        boolean oldTufiltp4aESet = tufiltp4aESet;
        tufiltp4a = TUFILTP4A_EDEFAULT;
        tufiltp4aESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A, oldTufiltp4a, TUFILTP4A_EDEFAULT, oldTufiltp4aESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufiltp4a() {
        return tufiltp4aESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4aIEC getWindTurbineType4aIEC() {
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC,
            NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = newWindTurbineType4aIEC;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet );
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
    public void setWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC ) {
        if( newWindTurbineType4aIEC != windTurbineType4aIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            if( newWindTurbineType4aIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4aIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicSetWindTurbineType4aIEC( newWindTurbineType4aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, newWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4aIEC( NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = null;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC, null,
                    oldWindTurbineType4aIECESet );
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
    public void unsetWindTurbineType4aIEC() {
        if( windTurbineType4aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, null, null,
                    oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4aIEC() {
        return windTurbineType4aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, WindTurbineType4aIEC.class, msgs );
            return basicSetWindTurbineType4aIEC( ( WindTurbineType4aIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            return basicUnsetWindTurbineType4aIEC( msgs );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A:
            return getDpmaxp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A:
            return getTpordp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A:
            return getTufiltp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            return getWindTurbineType4aIEC();
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A:
            setDpmaxp4a( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A:
            setTpordp4a( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A:
            setTufiltp4a( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            setWindTurbineType4aIEC( ( WindTurbineType4aIEC ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A:
            unsetDpmaxp4a();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A:
            unsetTpordp4a();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A:
            unsetTufiltp4a();
            return;
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            unsetWindTurbineType4aIEC();
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
        case CimPackage.WIND_CONT_PTYPE4A_IEC__DPMAXP4A:
            return isSetDpmaxp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TPORDP4A:
            return isSetTpordp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__TUFILTP4A:
            return isSetTufiltp4a();
        case CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC:
            return isSetWindTurbineType4aIEC();
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
        result.append( " (dpmaxp4a: " );
        if( dpmaxp4aESet )
            result.append( dpmaxp4a );
        else
            result.append( "<unset>" );
        result.append( ", tpordp4a: " );
        if( tpordp4aESet )
            result.append( tpordp4a );
        else
            result.append( "<unset>" );
        result.append( ", tufiltp4a: " );
        if( tufiltp4aESet )
            result.append( tufiltp4a );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPType4aIECImpl
