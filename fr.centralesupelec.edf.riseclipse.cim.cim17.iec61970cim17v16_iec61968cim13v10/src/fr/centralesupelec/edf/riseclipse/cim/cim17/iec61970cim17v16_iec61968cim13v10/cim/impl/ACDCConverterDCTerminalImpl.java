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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverterDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCPolarityKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACDC Converter DC Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterDCTerminalImpl#getPolarity <em>Polarity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACDCConverterDCTerminalImpl#getDCConductingEquipment <em>DC Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACDCConverterDCTerminalImpl extends DCBaseTerminalImpl implements ACDCConverterDCTerminal {
    /**
     * The default value of the '{@link #getPolarity() <em>Polarity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolarity()
     * @generated
     * @ordered
     */
    protected static final DCPolarityKind POLARITY_EDEFAULT = DCPolarityKind.POSITIVE;

    /**
     * The cached value of the '{@link #getPolarity() <em>Polarity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolarity()
     * @generated
     * @ordered
     */
    protected DCPolarityKind polarity = POLARITY_EDEFAULT;

    /**
     * This is true if the Polarity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean polarityESet;

    /**
     * The cached value of the '{@link #getDCConductingEquipment() <em>DC Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCConductingEquipment()
     * @generated
     * @ordered
     */
    protected ACDCConverter dcConductingEquipment;

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
    protected ACDCConverterDCTerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACDCConverterDCTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCPolarityKind getPolarity() {
        return polarity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPolarity( DCPolarityKind newPolarity ) {
        DCPolarityKind oldPolarity = polarity;
        polarity = newPolarity == null ? POLARITY_EDEFAULT : newPolarity;
        boolean oldPolarityESet = polarityESet;
        polarityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY, oldPolarity, polarity, !oldPolarityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPolarity() {
        DCPolarityKind oldPolarity = polarity;
        boolean oldPolarityESet = polarityESet;
        polarity = POLARITY_EDEFAULT;
        polarityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY, oldPolarity, POLARITY_EDEFAULT, oldPolarityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPolarity() {
        return polarityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCConverter getDCConductingEquipment() {
        return dcConductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCConductingEquipment( ACDCConverter newDCConductingEquipment,
            NotificationChain msgs ) {
        ACDCConverter oldDCConductingEquipment = dcConductingEquipment;
        dcConductingEquipment = newDCConductingEquipment;
        boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
        dcConductingEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, oldDCConductingEquipment,
                    newDCConductingEquipment, !oldDCConductingEquipmentESet );
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
    public void setDCConductingEquipment( ACDCConverter newDCConductingEquipment ) {
        if( newDCConductingEquipment != dcConductingEquipment ) {
            NotificationChain msgs = null;
            if( dcConductingEquipment != null ) msgs = ( ( InternalEObject ) dcConductingEquipment )
                    .eInverseRemove( this, CimPackage.ACDC_CONVERTER__DC_TERMINALS, ACDCConverter.class, msgs );
            if( newDCConductingEquipment != null ) msgs = ( ( InternalEObject ) newDCConductingEquipment )
                    .eInverseAdd( this, CimPackage.ACDC_CONVERTER__DC_TERMINALS, ACDCConverter.class, msgs );
            msgs = basicSetDCConductingEquipment( newDCConductingEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
            dcConductingEquipmentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, newDCConductingEquipment,
                    newDCConductingEquipment, !oldDCConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCConductingEquipment( NotificationChain msgs ) {
        ACDCConverter oldDCConductingEquipment = dcConductingEquipment;
        dcConductingEquipment = null;
        boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
        dcConductingEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, oldDCConductingEquipment, null,
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
                    CimPackage.ACDC_CONVERTER__DC_TERMINALS, ACDCConverter.class, msgs );
            msgs = basicUnsetDCConductingEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCConductingEquipmentESet = dcConductingEquipmentESet;
            dcConductingEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT, null, null,
                    oldDCConductingEquipmentESet ) );
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            if( dcConductingEquipment != null ) msgs = ( ( InternalEObject ) dcConductingEquipment )
                    .eInverseRemove( this, CimPackage.ACDC_CONVERTER__DC_TERMINALS, ACDCConverter.class, msgs );
            return basicSetDCConductingEquipment( ( ACDCConverter ) otherEnd, msgs );
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY:
            return getPolarity();
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY:
            setPolarity( ( DCPolarityKind ) newValue );
            return;
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            setDCConductingEquipment( ( ACDCConverter ) newValue );
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY:
            unsetPolarity();
            return;
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
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
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__POLARITY:
            return isSetPolarity();
        case CimPackage.ACDC_CONVERTER_DC_TERMINAL__DC_CONDUCTING_EQUIPMENT:
            return isSetDCConductingEquipment();
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
        result.append( " (polarity: " );
        if( polarityESet )
            result.append( polarity );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ACDCConverterDCTerminalImpl
