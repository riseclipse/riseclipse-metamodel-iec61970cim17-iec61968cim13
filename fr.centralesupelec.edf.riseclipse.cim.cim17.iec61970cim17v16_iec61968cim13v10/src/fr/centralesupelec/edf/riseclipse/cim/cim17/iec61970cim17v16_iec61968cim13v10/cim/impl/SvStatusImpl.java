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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SvStatusImpl#getInService <em>In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SvStatusImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SvStatusImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvStatusImpl extends StateVariableImpl implements SvStatus {
    /**
     * The default value of the '{@link #getInService() <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInService()
     * @generated
     * @ordered
     */
    protected static final Boolean IN_SERVICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInService() <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInService()
     * @generated
     * @ordered
     */
    protected Boolean inService = IN_SERVICE_EDEFAULT;

    /**
     * This is true if the In Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inServiceESet;

    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected ConductingEquipment conductingEquipment;

    /**
     * This is true if the Conducting Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conductingEquipmentESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SvStatusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvStatus();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getInService() {
        return inService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInService( Boolean newInService ) {
        Boolean oldInService = inService;
        inService = newInService;
        boolean oldInServiceESet = inServiceESet;
        inServiceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SV_STATUS__IN_SERVICE, oldInService, inService, !oldInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInService() {
        Boolean oldInService = inService;
        boolean oldInServiceESet = inServiceESet;
        inService = IN_SERVICE_EDEFAULT;
        inServiceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SV_STATUS__IN_SERVICE, oldInService, IN_SERVICE_EDEFAULT, oldInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInService() {
        return inServiceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( SinglePhaseKind newPhase ) {
        SinglePhaseKind oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SV_STATUS__PHASE, oldPhase, phase, !oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        SinglePhaseKind oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SV_STATUS__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment getConductingEquipment() {
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConductingEquipment( ConductingEquipment newConductingEquipment,
            NotificationChain msgs ) {
        ConductingEquipment oldConductingEquipment = conductingEquipment;
        conductingEquipment = newConductingEquipment;
        boolean oldConductingEquipmentESet = conductingEquipmentESet;
        conductingEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment,
                    !oldConductingEquipmentESet );
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
    public void setConductingEquipment( ConductingEquipment newConductingEquipment ) {
        if( newConductingEquipment != conductingEquipment ) {
            NotificationChain msgs = null;
            if( conductingEquipment != null ) msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs );
            if( newConductingEquipment != null ) msgs = ( ( InternalEObject ) newConductingEquipment )
                    .eInverseAdd( this, CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs );
            msgs = basicSetConductingEquipment( newConductingEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConductingEquipmentESet = conductingEquipmentESet;
            conductingEquipmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT,
                        newConductingEquipment, newConductingEquipment, !oldConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConductingEquipment( NotificationChain msgs ) {
        ConductingEquipment oldConductingEquipment = conductingEquipment;
        conductingEquipment = null;
        boolean oldConductingEquipmentESet = conductingEquipmentESet;
        conductingEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, oldConductingEquipment, null,
                    oldConductingEquipmentESet );
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
    public void unsetConductingEquipment() {
        if( conductingEquipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs );
            msgs = basicUnsetConductingEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConductingEquipmentESet = conductingEquipmentESet;
            conductingEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, null, null, oldConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            if( conductingEquipment != null ) msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, ConductingEquipment.class, msgs );
            return basicSetConductingEquipment( ( ConductingEquipment ) otherEnd, msgs );
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
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            return basicUnsetConductingEquipment( msgs );
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
        case CimPackage.SV_STATUS__IN_SERVICE:
            return getInService();
        case CimPackage.SV_STATUS__PHASE:
            return getPhase();
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
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
        case CimPackage.SV_STATUS__IN_SERVICE:
            setInService( ( Boolean ) newValue );
            return;
        case CimPackage.SV_STATUS__PHASE:
            setPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            setConductingEquipment( ( ConductingEquipment ) newValue );
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
        case CimPackage.SV_STATUS__IN_SERVICE:
            unsetInService();
            return;
        case CimPackage.SV_STATUS__PHASE:
            unsetPhase();
            return;
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
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
        case CimPackage.SV_STATUS__IN_SERVICE:
            return isSetInService();
        case CimPackage.SV_STATUS__PHASE:
            return isSetPhase();
        case CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
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
        result.append( " (inService: " );
        if( inServiceESet )
            result.append( inService );
        else
            result.append( "<unset>" );
        result.append( ", phase: " );
        if( phaseESet )
            result.append( phase );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvStatusImpl
