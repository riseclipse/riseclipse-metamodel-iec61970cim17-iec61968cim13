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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Generating Unit Meas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AltGeneratingUnitMeasImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AltGeneratingUnitMeasImpl#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AltGeneratingUnitMeasImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AltGeneratingUnitMeasImpl extends IdentifiedObjectImpl implements AltGeneratingUnitMeas {
    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final Integer PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected Integer priority = PRIORITY_EDEFAULT;

    /**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The cached value of the '{@link #getAnalogValue() <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogValue()
     * @generated
     * @ordered
     */
    protected AnalogValue analogValue;

    /**
     * This is true if the Analog Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogValueESet;

    /**
     * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlAreaGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ControlAreaGeneratingUnit controlAreaGeneratingUnit;

    /**
     * This is true if the Control Area Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlAreaGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AltGeneratingUnitMeasImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAltGeneratingUnitMeas();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriority( Integer newPriority ) {
        Integer oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY, oldPriority, priority, !oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriority() {
        Integer oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return priorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogValue getAnalogValue() {
        return analogValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalogValue( AnalogValue newAnalogValue, NotificationChain msgs ) {
        AnalogValue oldAnalogValue = analogValue;
        analogValue = newAnalogValue;
        boolean oldAnalogValueESet = analogValueESet;
        analogValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, oldAnalogValue, newAnalogValue,
                    !oldAnalogValueESet );
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
    public void setAnalogValue( AnalogValue newAnalogValue ) {
        if( newAnalogValue != analogValue ) {
            NotificationChain msgs = null;
            if( analogValue != null ) msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this,
                    CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs );
            if( newAnalogValue != null ) msgs = ( ( InternalEObject ) newAnalogValue ).eInverseAdd( this,
                    CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs );
            msgs = basicSetAnalogValue( newAnalogValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogValueESet = analogValueESet;
            analogValueESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE,
                            newAnalogValue, newAnalogValue, !oldAnalogValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalogValue( NotificationChain msgs ) {
        AnalogValue oldAnalogValue = analogValue;
        analogValue = null;
        boolean oldAnalogValueESet = analogValueESet;
        analogValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, oldAnalogValue, null, oldAnalogValueESet );
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
    public void unsetAnalogValue() {
        if( analogValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this,
                    CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs );
            msgs = basicUnsetAnalogValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogValueESet = analogValueESet;
            analogValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, null, null, oldAnalogValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogValue() {
        return analogValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlAreaGeneratingUnit getControlAreaGeneratingUnit() {
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControlAreaGeneratingUnit( ControlAreaGeneratingUnit newControlAreaGeneratingUnit,
            NotificationChain msgs ) {
        ControlAreaGeneratingUnit oldControlAreaGeneratingUnit = controlAreaGeneratingUnit;
        controlAreaGeneratingUnit = newControlAreaGeneratingUnit;
        boolean oldControlAreaGeneratingUnitESet = controlAreaGeneratingUnitESet;
        controlAreaGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, oldControlAreaGeneratingUnit,
                    newControlAreaGeneratingUnit, !oldControlAreaGeneratingUnitESet );
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
    public void setControlAreaGeneratingUnit( ControlAreaGeneratingUnit newControlAreaGeneratingUnit ) {
        if( newControlAreaGeneratingUnit != controlAreaGeneratingUnit ) {
            NotificationChain msgs = null;
            if( controlAreaGeneratingUnit != null )
                msgs = ( ( InternalEObject ) controlAreaGeneratingUnit ).eInverseRemove( this,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS,
                        ControlAreaGeneratingUnit.class, msgs );
            if( newControlAreaGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newControlAreaGeneratingUnit ).eInverseAdd( this,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS,
                        ControlAreaGeneratingUnit.class, msgs );
            msgs = basicSetControlAreaGeneratingUnit( newControlAreaGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaGeneratingUnitESet = controlAreaGeneratingUnitESet;
            controlAreaGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, newControlAreaGeneratingUnit,
                    newControlAreaGeneratingUnit, !oldControlAreaGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetControlAreaGeneratingUnit( NotificationChain msgs ) {
        ControlAreaGeneratingUnit oldControlAreaGeneratingUnit = controlAreaGeneratingUnit;
        controlAreaGeneratingUnit = null;
        boolean oldControlAreaGeneratingUnitESet = controlAreaGeneratingUnitESet;
        controlAreaGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, oldControlAreaGeneratingUnit,
                    null, oldControlAreaGeneratingUnitESet );
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
    public void unsetControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) controlAreaGeneratingUnit ).eInverseRemove( this,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class,
                    msgs );
            msgs = basicUnsetControlAreaGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaGeneratingUnitESet = controlAreaGeneratingUnitESet;
            controlAreaGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, null, null,
                    oldControlAreaGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlAreaGeneratingUnit() {
        return controlAreaGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            if( analogValue != null ) msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this,
                    CimPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs );
            return basicSetAnalogValue( ( AnalogValue ) otherEnd, msgs );
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            if( controlAreaGeneratingUnit != null )
                msgs = ( ( InternalEObject ) controlAreaGeneratingUnit ).eInverseRemove( this,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS,
                        ControlAreaGeneratingUnit.class, msgs );
            return basicSetControlAreaGeneratingUnit( ( ControlAreaGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            return basicUnsetAnalogValue( msgs );
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            return basicUnsetControlAreaGeneratingUnit( msgs );
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
        case CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
            return getPriority();
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            return getAnalogValue();
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            return getControlAreaGeneratingUnit();
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
        case CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
            setPriority( ( Integer ) newValue );
            return;
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            setAnalogValue( ( AnalogValue ) newValue );
            return;
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            setControlAreaGeneratingUnit( ( ControlAreaGeneratingUnit ) newValue );
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
        case CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            unsetAnalogValue();
            return;
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            unsetControlAreaGeneratingUnit();
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
        case CimPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
            return isSetPriority();
        case CimPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
            return isSetAnalogValue();
        case CimPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
            return isSetControlAreaGeneratingUnit();
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
        result.append( " (priority: " );
        if( priorityESet )
            result.append( priority );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AltGeneratingUnitMeasImpl
