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
 * An implementation of the model object '<em><b>Wind Gen Type3a IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3aIECImpl#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3aIECImpl#getTic <em>Tic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType3aIECImpl#getWindTurbineType4IEC <em>Wind Turbine Type4 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenType3aIECImpl extends WindGenType3IECImpl implements WindGenType3aIEC {
    /**
     * The default value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected static final Float KPC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected Float kpc = KPC_EDEFAULT;

    /**
     * This is true if the Kpc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpcESet;

    /**
     * The default value of the '{@link #getTic() <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTic()
     * @generated
     * @ordered
     */
    protected static final Float TIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTic() <em>Tic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTic()
     * @generated
     * @ordered
     */
    protected Float tic = TIC_EDEFAULT;

    /**
     * This is true if the Tic attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ticESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4IEC() <em>Wind Turbine Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4IEC windTurbineType4IEC;

    /**
     * This is true if the Wind Turbine Type4 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenType3aIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenType3aIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpc() {
        return kpc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpc( Float newKpc ) {
        Float oldKpc = kpc;
        kpc = newKpc;
        boolean oldKpcESet = kpcESet;
        kpcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE3A_IEC__KPC, oldKpc, kpc, !oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpc() {
        Float oldKpc = kpc;
        boolean oldKpcESet = kpcESet;
        kpc = KPC_EDEFAULT;
        kpcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE3A_IEC__KPC, oldKpc, KPC_EDEFAULT, oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpc() {
        return kpcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTic() {
        return tic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTic( Float newTic ) {
        Float oldTic = tic;
        tic = newTic;
        boolean oldTicESet = ticESet;
        ticESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE3A_IEC__TIC, oldTic, tic, !oldTicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTic() {
        Float oldTic = tic;
        boolean oldTicESet = ticESet;
        tic = TIC_EDEFAULT;
        ticESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE3A_IEC__TIC, oldTic, TIC_EDEFAULT, oldTicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTic() {
        return ticESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4IEC getWindTurbineType4IEC() {
        return windTurbineType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4IEC( WindTurbineType4IEC newWindTurbineType4IEC,
            NotificationChain msgs ) {
        WindTurbineType4IEC oldWindTurbineType4IEC = windTurbineType4IEC;
        windTurbineType4IEC = newWindTurbineType4IEC;
        boolean oldWindTurbineType4IECESet = windTurbineType4IECESet;
        windTurbineType4IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, oldWindTurbineType4IEC,
                    newWindTurbineType4IEC, !oldWindTurbineType4IECESet );
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
    public void setWindTurbineType4IEC( WindTurbineType4IEC newWindTurbineType4IEC ) {
        if( newWindTurbineType4IEC != windTurbineType4IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4IEC != null ) msgs = ( ( InternalEObject ) windTurbineType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, WindTurbineType4IEC.class, msgs );
            if( newWindTurbineType4IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, WindTurbineType4IEC.class, msgs );
            msgs = basicSetWindTurbineType4IEC( newWindTurbineType4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4IECESet = windTurbineType4IECESet;
            windTurbineType4IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, newWindTurbineType4IEC,
                    newWindTurbineType4IEC, !oldWindTurbineType4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4IEC( NotificationChain msgs ) {
        WindTurbineType4IEC oldWindTurbineType4IEC = windTurbineType4IEC;
        windTurbineType4IEC = null;
        boolean oldWindTurbineType4IECESet = windTurbineType4IECESet;
        windTurbineType4IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, oldWindTurbineType4IEC, null,
                    oldWindTurbineType4IECESet );
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
    public void unsetWindTurbineType4IEC() {
        if( windTurbineType4IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, WindTurbineType4IEC.class, msgs );
            msgs = basicUnsetWindTurbineType4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4IECESet = windTurbineType4IECESet;
            windTurbineType4IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC, null, null, oldWindTurbineType4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4IEC() {
        return windTurbineType4IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            if( windTurbineType4IEC != null ) msgs = ( ( InternalEObject ) windTurbineType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4_IEC__WIND_GEN_TYPE3A_IEC, WindTurbineType4IEC.class, msgs );
            return basicSetWindTurbineType4IEC( ( WindTurbineType4IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            return basicUnsetWindTurbineType4IEC( msgs );
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
        case CimPackage.WIND_GEN_TYPE3A_IEC__KPC:
            return getKpc();
        case CimPackage.WIND_GEN_TYPE3A_IEC__TIC:
            return getTic();
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            return getWindTurbineType4IEC();
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
        case CimPackage.WIND_GEN_TYPE3A_IEC__KPC:
            setKpc( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE3A_IEC__TIC:
            setTic( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            setWindTurbineType4IEC( ( WindTurbineType4IEC ) newValue );
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
        case CimPackage.WIND_GEN_TYPE3A_IEC__KPC:
            unsetKpc();
            return;
        case CimPackage.WIND_GEN_TYPE3A_IEC__TIC:
            unsetTic();
            return;
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            unsetWindTurbineType4IEC();
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
        case CimPackage.WIND_GEN_TYPE3A_IEC__KPC:
            return isSetKpc();
        case CimPackage.WIND_GEN_TYPE3A_IEC__TIC:
            return isSetTic();
        case CimPackage.WIND_GEN_TYPE3A_IEC__WIND_TURBINE_TYPE4_IEC:
            return isSetWindTurbineType4IEC();
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
        result.append( " (kpc: " );
        if( kpcESet )
            result.append( kpc );
        else
            result.append( "<unset>" );
        result.append( ", tic: " );
        if( ticESet )
            result.append( tic );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGenType3aIECImpl
