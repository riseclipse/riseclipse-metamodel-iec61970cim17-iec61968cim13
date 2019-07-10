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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltTieMeas;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analog;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogValueImpl#getAnalog <em>Analog</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogValueImpl#getAnalogControl <em>Analog Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogValueImpl#getAltGeneratingUnit <em>Alt Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AnalogValueImpl#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogValueImpl extends MeasurementValueImpl implements AnalogValue {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Float VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Float value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getAnalog() <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalog()
     * @generated
     * @ordered
     */
    protected Analog analog;

    /**
     * This is true if the Analog reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogESet;

    /**
     * The cached value of the '{@link #getAnalogControl() <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogControl()
     * @generated
     * @ordered
     */
    protected AnalogControl analogControl;

    /**
     * This is true if the Analog Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogControlESet;

    /**
     * The cached value of the '{@link #getAltGeneratingUnit() <em>Alt Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAltGeneratingUnit()
     * @generated
     * @ordered
     */
    protected EList< AltGeneratingUnitMeas > altGeneratingUnit;

    /**
     * The cached value of the '{@link #getAltTieMeas() <em>Alt Tie Meas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAltTieMeas()
     * @generated
     * @ordered
     */
    protected EList< AltTieMeas > altTieMeas;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalogValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Float newValue ) {
        Float oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ANALOG_VALUE__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        Float oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ANALOG_VALUE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Analog getAnalog() {
        return analog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalog( Analog newAnalog, NotificationChain msgs ) {
        Analog oldAnalog = analog;
        analog = newAnalog;
        boolean oldAnalogESet = analogESet;
        analogESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_VALUE__ANALOG, oldAnalog, newAnalog, !oldAnalogESet );
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
    public void setAnalog( Analog newAnalog ) {
        if( newAnalog != analog ) {
            NotificationChain msgs = null;
            if( analog != null ) msgs = ( ( InternalEObject ) analog ).eInverseRemove( this,
                    CimPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs );
            if( newAnalog != null ) msgs = ( ( InternalEObject ) newAnalog ).eInverseAdd( this,
                    CimPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs );
            msgs = basicSetAnalog( newAnalog, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogESet = analogESet;
            analogESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_VALUE__ANALOG, newAnalog, newAnalog, !oldAnalogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalog( NotificationChain msgs ) {
        Analog oldAnalog = analog;
        analog = null;
        boolean oldAnalogESet = analogESet;
        analogESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG, oldAnalog, null, oldAnalogESet );
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
    public void unsetAnalog() {
        if( analog != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analog ).eInverseRemove( this, CimPackage.ANALOG__ANALOG_VALUES, Analog.class,
                    msgs );
            msgs = basicUnsetAnalog( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogESet = analogESet;
            analogESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG, null, null, oldAnalogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalog() {
        return analogESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogControl getAnalogControl() {
        if( analogControl != null && analogControl.eIsProxy() ) {
            InternalEObject oldAnalogControl = ( InternalEObject ) analogControl;
            analogControl = ( AnalogControl ) eResolveProxy( oldAnalogControl );
            if( analogControl != oldAnalogControl ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ANALOG_VALUE__ANALOG_CONTROL, oldAnalogControl, analogControl ) );
            }
        }
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalogControl basicGetAnalogControl() {
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalogControl( AnalogControl newAnalogControl, NotificationChain msgs ) {
        AnalogControl oldAnalogControl = analogControl;
        analogControl = newAnalogControl;
        boolean oldAnalogControlESet = analogControlESet;
        analogControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_VALUE__ANALOG_CONTROL, oldAnalogControl, newAnalogControl,
                    !oldAnalogControlESet );
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
    public void setAnalogControl( AnalogControl newAnalogControl ) {
        if( newAnalogControl != analogControl ) {
            NotificationChain msgs = null;
            if( analogControl != null ) msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this,
                    CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            if( newAnalogControl != null ) msgs = ( ( InternalEObject ) newAnalogControl ).eInverseAdd( this,
                    CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            msgs = basicSetAnalogControl( newAnalogControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogControlESet = analogControlESet;
            analogControlESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_VALUE__ANALOG_CONTROL,
                        newAnalogControl, newAnalogControl, !oldAnalogControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalogControl( NotificationChain msgs ) {
        AnalogControl oldAnalogControl = analogControl;
        analogControl = null;
        boolean oldAnalogControlESet = analogControlESet;
        analogControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG_CONTROL, oldAnalogControl, null, oldAnalogControlESet );
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
    public void unsetAnalogControl() {
        if( analogControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this, CimPackage.ANALOG_CONTROL__ANALOG_VALUE,
                    AnalogControl.class, msgs );
            msgs = basicUnsetAnalogControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogControlESet = analogControlESet;
            analogControlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG_CONTROL, null, null, oldAnalogControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogControl() {
        return analogControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AltGeneratingUnitMeas > getAltGeneratingUnit() {
        if( altGeneratingUnit == null ) {
            altGeneratingUnit = new EObjectWithInverseResolvingEList.Unsettable< AltGeneratingUnitMeas >(
                    AltGeneratingUnitMeas.class, this, CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE );
        }
        return altGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAltGeneratingUnit() {
        if( altGeneratingUnit != null ) ( ( InternalEList.Unsettable< ? > ) altGeneratingUnit ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAltGeneratingUnit() {
        return altGeneratingUnit != null && ( ( InternalEList.Unsettable< ? > ) altGeneratingUnit ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AltTieMeas > getAltTieMeas() {
        if( altTieMeas == null ) {
            altTieMeas = new EObjectWithInverseResolvingEList.Unsettable< AltTieMeas >( AltTieMeas.class, this,
                    CimPackage.ANALOG_VALUE__ALT_TIE_MEAS, CimPackage.ALT_TIE_MEAS__ANALOG_VALUE );
        }
        return altTieMeas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAltTieMeas() {
        if( altTieMeas != null ) ( ( InternalEList.Unsettable< ? > ) altTieMeas ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAltTieMeas() {
        return altTieMeas != null && ( ( InternalEList.Unsettable< ? > ) altTieMeas ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ANALOG_VALUE__ANALOG:
            if( analog != null ) msgs = ( ( InternalEObject ) analog ).eInverseRemove( this,
                    CimPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs );
            return basicSetAnalog( ( Analog ) otherEnd, msgs );
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            if( analogControl != null ) msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this,
                    CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            return basicSetAnalogControl( ( AnalogControl ) otherEnd, msgs );
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAltGeneratingUnit() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAltTieMeas() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            return basicUnsetAnalog( msgs );
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            return basicUnsetAnalogControl( msgs );
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            return ( ( InternalEList< ? > ) getAltGeneratingUnit() ).basicRemove( otherEnd, msgs );
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            return ( ( InternalEList< ? > ) getAltTieMeas() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ANALOG_VALUE__VALUE:
            return getValue();
        case CimPackage.ANALOG_VALUE__ANALOG:
            return getAnalog();
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            if( resolve ) return getAnalogControl();
            return basicGetAnalogControl();
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            return getAltGeneratingUnit();
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            return getAltTieMeas();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.ANALOG_VALUE__VALUE:
            setValue( ( Float ) newValue );
            return;
        case CimPackage.ANALOG_VALUE__ANALOG:
            setAnalog( ( Analog ) newValue );
            return;
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            setAnalogControl( ( AnalogControl ) newValue );
            return;
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            getAltGeneratingUnit().clear();
            getAltGeneratingUnit().addAll( ( Collection< ? extends AltGeneratingUnitMeas > ) newValue );
            return;
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            getAltTieMeas().clear();
            getAltTieMeas().addAll( ( Collection< ? extends AltTieMeas > ) newValue );
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
        case CimPackage.ANALOG_VALUE__VALUE:
            unsetValue();
            return;
        case CimPackage.ANALOG_VALUE__ANALOG:
            unsetAnalog();
            return;
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            unsetAnalogControl();
            return;
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            unsetAltGeneratingUnit();
            return;
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            unsetAltTieMeas();
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
        case CimPackage.ANALOG_VALUE__VALUE:
            return isSetValue();
        case CimPackage.ANALOG_VALUE__ANALOG:
            return isSetAnalog();
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            return isSetAnalogControl();
        case CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
            return isSetAltGeneratingUnit();
        case CimPackage.ANALOG_VALUE__ALT_TIE_MEAS:
            return isSetAltTieMeas();
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
        result.append( " (value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalogValueImpl
