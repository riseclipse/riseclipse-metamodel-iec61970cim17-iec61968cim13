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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipmentStatusKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contingency Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ContingencyEquipmentImpl#getContingentStatus <em>Contingent Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ContingencyEquipmentImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContingencyEquipmentImpl extends ContingencyElementImpl implements ContingencyEquipment {
    /**
     * The default value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContingentStatus()
     * @generated
     * @ordered
     */
    protected static final ContingencyEquipmentStatusKind CONTINGENT_STATUS_EDEFAULT = ContingencyEquipmentStatusKind.IN_SERVICE;

    /**
     * The cached value of the '{@link #getContingentStatus() <em>Contingent Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContingentStatus()
     * @generated
     * @ordered
     */
    protected ContingencyEquipmentStatusKind contingentStatus = CONTINGENT_STATUS_EDEFAULT;

    /**
     * This is true if the Contingent Status attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean contingentStatusESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContingencyEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getContingencyEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ContingencyEquipmentStatusKind getContingentStatus() {
        return contingentStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setContingentStatus( ContingencyEquipmentStatusKind newContingentStatus ) {
        ContingencyEquipmentStatusKind oldContingentStatus = contingentStatus;
        contingentStatus = newContingentStatus == null ? CONTINGENT_STATUS_EDEFAULT : newContingentStatus;
        boolean oldContingentStatusESet = contingentStatusESet;
        contingentStatusESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS,
                    oldContingentStatus, contingentStatus, !oldContingentStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetContingentStatus() {
        ContingencyEquipmentStatusKind oldContingentStatus = contingentStatus;
        boolean oldContingentStatusESet = contingentStatusESet;
        contingentStatus = CONTINGENT_STATUS_EDEFAULT;
        contingentStatusESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS,
                        oldContingentStatus, CONTINGENT_STATUS_EDEFAULT, oldContingentStatusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContingentStatus() {
        return contingentStatusESet;
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
                    CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, oldEquipment, newEquipment, !oldEquipmentESet );
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
                    CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs );
            if( newEquipment != null ) msgs = ( ( InternalEObject ) newEquipment ).eInverseAdd( this,
                    CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs );
            msgs = basicSetEquipment( newEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentESet = equipmentESet;
            equipmentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, newEquipment, newEquipment, !oldEquipmentESet ) );
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
                    CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, oldEquipment, null, oldEquipmentESet );
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
            msgs = ( ( InternalEObject ) equipment ).eInverseRemove( this, CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT,
                    Equipment.class, msgs );
            msgs = basicUnsetEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentESet = equipmentESet;
            equipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT, null, null, oldEquipmentESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            if( equipment != null ) msgs = ( ( InternalEObject ) equipment ).eInverseRemove( this,
                    CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT, Equipment.class, msgs );
            return basicSetEquipment( ( Equipment ) otherEnd, msgs );
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
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            return basicUnsetEquipment( msgs );
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
        case CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
            return getContingentStatus();
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            return getEquipment();
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
        case CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
            setContingentStatus( ( ContingencyEquipmentStatusKind ) newValue );
            return;
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            setEquipment( ( Equipment ) newValue );
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
        case CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
            unsetContingentStatus();
            return;
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            unsetEquipment();
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
        case CimPackage.CONTINGENCY_EQUIPMENT__CONTINGENT_STATUS:
            return isSetContingentStatus();
        case CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT:
            return isSetEquipment();
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
        result.append( " (contingentStatus: " );
        if( contingentStatusESet )
            result.append( contingentStatus );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ContingencyEquipmentImpl
