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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type1or2 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType1or2IECImpl#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType1or2IECImpl#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType1or2IECImpl extends WindTurbineType1or2DynamicsImpl implements WindTurbineType1or2IEC {
    /**
     * The cached value of the '{@link #getWindMechIEC() <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindMechIEC()
     * @generated
     * @ordered
     */
    protected WindMechIEC windMechIEC;

    /**
     * This is true if the Wind Mech IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windMechIECESet;

    /**
     * The cached value of the '{@link #getWindProtectionIEC() <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindProtectionIEC()
     * @generated
     * @ordered
     */
    protected WindProtectionIEC windProtectionIEC;

    /**
     * This is true if the Wind Protection IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windProtectionIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType1or2IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType1or2IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC getWindMechIEC() {
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindMechIEC( WindMechIEC newWindMechIEC, NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = newWindMechIEC;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, oldWindMechIEC, newWindMechIEC,
                    !oldWindMechIECESet );
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
    public void setWindMechIEC( WindMechIEC newWindMechIEC ) {
        if( newWindMechIEC != windMechIEC ) {
            NotificationChain msgs = null;
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindMechIEC.class, msgs );
            if( newWindMechIEC != null ) msgs = ( ( InternalEObject ) newWindMechIEC ).eInverseAdd( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindMechIEC.class, msgs );
            msgs = basicSetWindMechIEC( newWindMechIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC,
                            newWindMechIEC, newWindMechIEC, !oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindMechIEC( NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = null;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, oldWindMechIEC, null, oldWindMechIECESet );
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
    public void unsetWindMechIEC() {
        if( windMechIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindMechIEC.class, msgs );
            msgs = basicUnsetWindMechIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC, null, null, oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindMechIEC() {
        return windMechIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC getWindProtectionIEC() {
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindProtectionIEC( WindProtectionIEC newWindProtectionIEC,
            NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = newWindProtectionIEC;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet );
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
    public void setWindProtectionIEC( WindProtectionIEC newWindProtectionIEC ) {
        if( newWindProtectionIEC != windProtectionIEC ) {
            NotificationChain msgs = null;
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindProtectionIEC.class, msgs );
            if( newWindProtectionIEC != null ) msgs = ( ( InternalEObject ) newWindProtectionIEC ).eInverseAdd( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindProtectionIEC.class, msgs );
            msgs = basicSetWindProtectionIEC( newWindProtectionIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, newWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindProtectionIEC( NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = null;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC, null,
                    oldWindProtectionIECESet );
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
    public void unsetWindProtectionIEC() {
        if( windProtectionIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindProtectionIEC.class, msgs );
            msgs = basicUnsetWindProtectionIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, null, null, oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindProtectionIEC() {
        return windProtectionIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindMechIEC.class, msgs );
            return basicSetWindMechIEC( ( WindMechIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, WindProtectionIEC.class, msgs );
            return basicSetWindProtectionIEC( ( WindProtectionIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            return basicUnsetWindMechIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            return basicUnsetWindProtectionIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            return getWindMechIEC();
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            return getWindProtectionIEC();
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            setWindMechIEC( ( WindMechIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            setWindProtectionIEC( ( WindProtectionIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            unsetWindMechIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            unsetWindProtectionIEC();
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
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_MECH_IEC:
            return isSetWindMechIEC();
        case CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC:
            return isSetWindProtectionIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType1or2IECImpl
