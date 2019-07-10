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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTerminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCTerminalImpl#getDCConductingEquipment <em>DC Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCTerminalImpl extends DCBaseTerminalImpl implements DCTerminal {
    /**
     * The cached value of the '{@link #getDCConductingEquipment() <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCConductingEquipment()
     * @generated
     * @ordered
     */
    protected DCConductingEquipment dcConductingEquipment;

    /**
     * This is true if the DC Conducting Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcConductingEquipmentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCTerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConductingEquipment getDCConductingEquipment() {
        return dcConductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCConductingEquipment( DCConductingEquipment newDCConductingEquipment,
            NotificationChain msgs ) {
        DCConductingEquipment oldDCConductingEquipment = dcConductingEquipment;
        dcConductingEquipment = newDCConductingEquipment;
        boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
        dcConductingEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, oldDCConductingEquipment, newDCConductingEquipment,
                    !oldDCConductingEquipmentESet );
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
    public void setDCConductingEquipment( DCConductingEquipment newDCConductingEquipment ) {
        if( newDCConductingEquipment != dcConductingEquipment ) {
            NotificationChain msgs = null;
            if( dcConductingEquipment != null )
                msgs = ( ( InternalEObject ) dcConductingEquipment ).eInverseRemove( this,
                        CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS, DCConductingEquipment.class, msgs );
            if( newDCConductingEquipment != null )
                msgs = ( ( InternalEObject ) newDCConductingEquipment ).eInverseAdd( this,
                        CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS, DCConductingEquipment.class, msgs );
            msgs = basicSetDCConductingEquipment( newDCConductingEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
            dcConductingEquipmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT,
                        newDCConductingEquipment, newDCConductingEquipment, !oldDCConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCConductingEquipment( NotificationChain msgs ) {
        DCConductingEquipment oldDCConductingEquipment = dcConductingEquipment;
        dcConductingEquipment = null;
        boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
        dcConductingEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, oldDCConductingEquipment, null,
                    oldDCConductingEquipmentESet );
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
    public void unsetDCConductingEquipment() {
        if( dcConductingEquipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcConductingEquipment ).eInverseRemove( this,
                    CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS, DCConductingEquipment.class, msgs );
            msgs = basicUnsetDCConductingEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
            dcConductingEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, null, null, oldDCConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCConductingEquipment() {
        return dcConductingEquipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            if( dcConductingEquipment != null )
                msgs = ( ( InternalEObject ) dcConductingEquipment ).eInverseRemove( this,
                        CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS, DCConductingEquipment.class, msgs );
            return basicSetDCConductingEquipment( ( DCConductingEquipment ) otherEnd, msgs );
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
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            return basicUnsetDCConductingEquipment( msgs );
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
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            return getDCConductingEquipment();
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
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            setDCConductingEquipment( ( DCConductingEquipment ) newValue );
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
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            unsetDCConductingEquipment();
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
        case CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            return isSetDCConductingEquipment();
        }
        return super.eIsSet( featureID );
    }

} //DCTerminalImpl
