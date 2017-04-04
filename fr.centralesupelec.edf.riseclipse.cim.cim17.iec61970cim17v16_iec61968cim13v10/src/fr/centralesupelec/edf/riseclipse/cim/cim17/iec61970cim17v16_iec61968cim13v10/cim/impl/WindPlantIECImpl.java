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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantReactiveControlIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Plant IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantIECImpl#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantIECImpl#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPlantIECImpl extends WindPlantDynamicsImpl implements WindPlantIEC {
    /**
     * The cached value of the '{@link #getWindPlantReactiveControlIEC() <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantReactiveControlIEC()
     * @generated
     * @ordered
     */
    protected WindPlantReactiveControlIEC windPlantReactiveControlIEC;

    /**
     * This is true if the Wind Plant Reactive Control IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantReactiveControlIECESet;

    /**
     * The cached value of the '{@link #getWindPlantFreqPcontrolIEC() <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantFreqPcontrolIEC()
     * @generated
     * @ordered
     */
    protected WindPlantFreqPcontrolIEC windPlantFreqPcontrolIEC;

    /**
     * This is true if the Wind Plant Freq Pcontrol IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantFreqPcontrolIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPlantIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPlantIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantReactiveControlIEC getWindPlantReactiveControlIEC() {
        return windPlantReactiveControlIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantReactiveControlIEC(
            WindPlantReactiveControlIEC newWindPlantReactiveControlIEC, NotificationChain msgs ) {
        WindPlantReactiveControlIEC oldWindPlantReactiveControlIEC = windPlantReactiveControlIEC;
        windPlantReactiveControlIEC = newWindPlantReactiveControlIEC;
        boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
        windPlantReactiveControlIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, oldWindPlantReactiveControlIEC,
                    newWindPlantReactiveControlIEC, !oldWindPlantReactiveControlIECESet );
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
    public void setWindPlantReactiveControlIEC( WindPlantReactiveControlIEC newWindPlantReactiveControlIEC ) {
        if( newWindPlantReactiveControlIEC != windPlantReactiveControlIEC ) {
            NotificationChain msgs = null;
            if( windPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, WindPlantReactiveControlIEC.class,
                        msgs );
            if( newWindPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantReactiveControlIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, WindPlantReactiveControlIEC.class,
                        msgs );
            msgs = basicSetWindPlantReactiveControlIEC( newWindPlantReactiveControlIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
            windPlantReactiveControlIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, newWindPlantReactiveControlIEC,
                    newWindPlantReactiveControlIEC, !oldWindPlantReactiveControlIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantReactiveControlIEC( NotificationChain msgs ) {
        WindPlantReactiveControlIEC oldWindPlantReactiveControlIEC = windPlantReactiveControlIEC;
        windPlantReactiveControlIEC = null;
        boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
        windPlantReactiveControlIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, oldWindPlantReactiveControlIEC, null,
                    oldWindPlantReactiveControlIECESet );
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
    public void unsetWindPlantReactiveControlIEC() {
        if( windPlantReactiveControlIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, WindPlantReactiveControlIEC.class,
                    msgs );
            msgs = basicUnsetWindPlantReactiveControlIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantReactiveControlIECESet = windPlantReactiveControlIECESet;
            windPlantReactiveControlIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC, null, null,
                    oldWindPlantReactiveControlIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantReactiveControlIEC() {
        return windPlantReactiveControlIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC() {
        if( windPlantFreqPcontrolIEC != null && windPlantFreqPcontrolIEC.eIsProxy() ) {
            InternalEObject oldWindPlantFreqPcontrolIEC = ( InternalEObject ) windPlantFreqPcontrolIEC;
            windPlantFreqPcontrolIEC = ( WindPlantFreqPcontrolIEC ) eResolveProxy( oldWindPlantFreqPcontrolIEC );
            if( windPlantFreqPcontrolIEC != oldWindPlantFreqPcontrolIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, oldWindPlantFreqPcontrolIEC,
                        windPlantFreqPcontrolIEC ) );
            }
        }
        return windPlantFreqPcontrolIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindPlantFreqPcontrolIEC basicGetWindPlantFreqPcontrolIEC() {
        return windPlantFreqPcontrolIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC newWindPlantFreqPcontrolIEC,
            NotificationChain msgs ) {
        WindPlantFreqPcontrolIEC oldWindPlantFreqPcontrolIEC = windPlantFreqPcontrolIEC;
        windPlantFreqPcontrolIEC = newWindPlantFreqPcontrolIEC;
        boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
        windPlantFreqPcontrolIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, oldWindPlantFreqPcontrolIEC,
                    newWindPlantFreqPcontrolIEC, !oldWindPlantFreqPcontrolIECESet );
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
    public void setWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC newWindPlantFreqPcontrolIEC ) {
        if( newWindPlantFreqPcontrolIEC != windPlantFreqPcontrolIEC ) {
            NotificationChain msgs = null;
            if( windPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, WindPlantFreqPcontrolIEC.class, msgs );
            if( newWindPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) newWindPlantFreqPcontrolIEC ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, WindPlantFreqPcontrolIEC.class, msgs );
            msgs = basicSetWindPlantFreqPcontrolIEC( newWindPlantFreqPcontrolIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
            windPlantFreqPcontrolIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, newWindPlantFreqPcontrolIEC,
                    newWindPlantFreqPcontrolIEC, !oldWindPlantFreqPcontrolIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantFreqPcontrolIEC( NotificationChain msgs ) {
        WindPlantFreqPcontrolIEC oldWindPlantFreqPcontrolIEC = windPlantFreqPcontrolIEC;
        windPlantFreqPcontrolIEC = null;
        boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
        windPlantFreqPcontrolIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, oldWindPlantFreqPcontrolIEC, null,
                    oldWindPlantFreqPcontrolIECESet );
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
    public void unsetWindPlantFreqPcontrolIEC() {
        if( windPlantFreqPcontrolIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, WindPlantFreqPcontrolIEC.class, msgs );
            msgs = basicUnsetWindPlantFreqPcontrolIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantFreqPcontrolIECESet = windPlantFreqPcontrolIECESet;
            windPlantFreqPcontrolIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, null, null,
                    oldWindPlantFreqPcontrolIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantFreqPcontrolIEC() {
        return windPlantFreqPcontrolIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            if( windPlantReactiveControlIEC != null )
                msgs = ( ( InternalEObject ) windPlantReactiveControlIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_REACTIVE_CONTROL_IEC__WIND_PLANT_IEC, WindPlantReactiveControlIEC.class,
                        msgs );
            return basicSetWindPlantReactiveControlIEC( ( WindPlantReactiveControlIEC ) otherEnd, msgs );
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            if( windPlantFreqPcontrolIEC != null )
                msgs = ( ( InternalEObject ) windPlantFreqPcontrolIEC ).eInverseRemove( this,
                        CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, WindPlantFreqPcontrolIEC.class, msgs );
            return basicSetWindPlantFreqPcontrolIEC( ( WindPlantFreqPcontrolIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return basicUnsetWindPlantReactiveControlIEC( msgs );
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            return basicUnsetWindPlantFreqPcontrolIEC( msgs );
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
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return getWindPlantReactiveControlIEC();
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            if( resolve ) return getWindPlantFreqPcontrolIEC();
            return basicGetWindPlantFreqPcontrolIEC();
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
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            setWindPlantReactiveControlIEC( ( WindPlantReactiveControlIEC ) newValue );
            return;
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            setWindPlantFreqPcontrolIEC( ( WindPlantFreqPcontrolIEC ) newValue );
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
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            unsetWindPlantReactiveControlIEC();
            return;
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            unsetWindPlantFreqPcontrolIEC();
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
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_REACTIVE_CONTROL_IEC:
            return isSetWindPlantReactiveControlIEC();
        case CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC:
            return isSetWindPlantFreqPcontrolIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindPlantIECImpl
