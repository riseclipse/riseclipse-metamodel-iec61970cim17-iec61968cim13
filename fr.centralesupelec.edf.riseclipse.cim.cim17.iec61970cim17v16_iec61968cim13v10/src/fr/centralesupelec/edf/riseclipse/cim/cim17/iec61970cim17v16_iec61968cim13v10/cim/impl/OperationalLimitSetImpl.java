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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet;

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
 * An implementation of the model object '<em><b>Operational Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalLimitSetImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalLimitSetImpl#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OperationalLimitSetImpl#getOperationalLimitValue <em>Operational Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitSetImpl extends IdentifiedObjectImpl implements OperationalLimitSet {
    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected ACDCTerminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipment()
     * @generated
     * @ordered
     */
    protected Equipment equipment;

    /**
     * This is true if the Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean equipmentESet;

    /**
     * The cached value of the '{@link #getOperationalLimitValue() <em>Operational Limit Value</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitValue()
     * @generated
     * @ordered
     */
    protected EList< OperationalLimit > operationalLimitValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalLimitSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalLimitSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCTerminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( ACDCTerminal newTerminal, NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( ACDCTerminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET, ACDCTerminal.class, msgs );
            if( newTerminal != null ) msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this,
                    CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET, ACDCTerminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL, newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET, ACDCTerminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL, null, null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEquipment( Equipment newEquipment, NotificationChain msgs ) {
        Equipment oldEquipment = equipment;
        equipment = newEquipment;
        boolean oldEquipmentESet = equipmentESet;
        equipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, newEquipment, !oldEquipmentESet );
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
    public void setEquipment( Equipment newEquipment ) {
        if( newEquipment != equipment ) {
            NotificationChain msgs = null;
            if( equipment != null ) msgs = ( ( InternalEObject ) equipment ).eInverseRemove( this,
                    CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs );
            if( newEquipment != null ) msgs = ( ( InternalEObject ) newEquipment ).eInverseAdd( this,
                    CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs );
            msgs = basicSetEquipment( newEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentESet = equipmentESet;
            equipmentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, newEquipment, newEquipment, !oldEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEquipment( NotificationChain msgs ) {
        Equipment oldEquipment = equipment;
        equipment = null;
        boolean oldEquipmentESet = equipmentESet;
        equipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, oldEquipment, null, oldEquipmentESet );
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
    public void unsetEquipment() {
        if( equipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) equipment ).eInverseRemove( this, CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET,
                    Equipment.class, msgs );
            msgs = basicUnsetEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentESet = equipmentESet;
            equipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT, null, null, oldEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipment() {
        return equipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalLimit > getOperationalLimitValue() {
        if( operationalLimitValue == null ) {
            operationalLimitValue = new EObjectWithInverseResolvingEList.Unsettable< OperationalLimit >(
                    OperationalLimit.class, this, CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET );
        }
        return operationalLimitValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalLimitValue() {
        if( operationalLimitValue != null ) ( ( InternalEList.Unsettable< ? > ) operationalLimitValue ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitValue() {
        return operationalLimitValue != null && ( ( InternalEList.Unsettable< ? > ) operationalLimitValue ).isSet();
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.ACDC_TERMINAL__OPERATIONAL_LIMIT_SET, ACDCTerminal.class, msgs );
            return basicSetTerminal( ( ACDCTerminal ) otherEnd, msgs );
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            if( equipment != null ) msgs = ( ( InternalEObject ) equipment ).eInverseRemove( this,
                    CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET, Equipment.class, msgs );
            return basicSetEquipment( ( Equipment ) otherEnd, msgs );
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalLimitValue() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            return basicUnsetEquipment( msgs );
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            return ( ( InternalEList< ? > ) getOperationalLimitValue() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            return getTerminal();
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            return getEquipment();
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            return getOperationalLimitValue();
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            setTerminal( ( ACDCTerminal ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            setEquipment( ( Equipment ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            getOperationalLimitValue().clear();
            getOperationalLimitValue().addAll( ( Collection< ? extends OperationalLimit > ) newValue );
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            unsetEquipment();
            return;
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            unsetOperationalLimitValue();
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
        case CimPackage.OPERATIONAL_LIMIT_SET__TERMINAL:
            return isSetTerminal();
        case CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT:
            return isSetEquipment();
        case CimPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE:
            return isSetOperationalLimitValue();
        }
        return super.eIsSet( featureID );
    }

} //OperationalLimitSetImpl
