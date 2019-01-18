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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getInService <em>In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getNormallyInService <em>Normally In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getContingencyEquipment <em>Contingency Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getOutages <em>Outages</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EquipmentImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends PowerSystemResourceImpl implements Equipment {
    /**
     * The default value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected static final Boolean AGGREGATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected Boolean aggregate = AGGREGATE_EDEFAULT;

    /**
     * This is true if the Aggregate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aggregateESet;

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
     * The default value of the '{@link #getNormallyInService() <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormallyInService()
     * @generated
     * @ordered
     */
    protected static final Boolean NORMALLY_IN_SERVICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormallyInService() <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormallyInService()
     * @generated
     * @ordered
     */
    protected Boolean normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;

    /**
     * This is true if the Normally In Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normallyInServiceESet;

    /**
     * The cached value of the '{@link #getContingencyEquipment() <em>Contingency Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContingencyEquipment()
     * @generated
     * @ordered
     */
    protected EList< ContingencyEquipment > contingencyEquipment;

    /**
     * The cached value of the '{@link #getFaults() <em>Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected EList< Fault > faults;

    /**
     * The cached value of the '{@link #getUsagePoints() <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoints()
     * @generated
     * @ordered
     */
    protected EList< UsagePoint > usagePoints;

    /**
     * The cached value of the '{@link #getOperationalRestrictions() <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalRestrictions()
     * @generated
     * @ordered
     */
    protected EList< OperationalRestriction > operationalRestrictions;

    /**
     * The cached value of the '{@link #getEquipmentContainer() <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipmentContainer()
     * @generated
     * @ordered
     */
    protected EquipmentContainer equipmentContainer;

    /**
     * This is true if the Equipment Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean equipmentContainerESet;

    /**
     * The cached value of the '{@link #getOutages() <em>Outages</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutages()
     * @generated
     * @ordered
     */
    protected EList< Outage > outages;

    /**
     * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitSet()
     * @generated
     * @ordered
     */
    protected EList< OperationalLimitSet > operationalLimitSet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getAggregate() {
        return aggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregate( Boolean newAggregate ) {
        Boolean oldAggregate = aggregate;
        aggregate = newAggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EQUIPMENT__AGGREGATE, oldAggregate, aggregate, !oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAggregate() {
        Boolean oldAggregate = aggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregate = AGGREGATE_EDEFAULT;
        aggregateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EQUIPMENT__AGGREGATE, oldAggregate, AGGREGATE_EDEFAULT, oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAggregate() {
        return aggregateESet;
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
                CimPackage.EQUIPMENT__IN_SERVICE, oldInService, inService, !oldInServiceESet ) );
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
                CimPackage.EQUIPMENT__IN_SERVICE, oldInService, IN_SERVICE_EDEFAULT, oldInServiceESet ) );
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
    public Boolean getNormallyInService() {
        return normallyInService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormallyInService( Boolean newNormallyInService ) {
        Boolean oldNormallyInService = normallyInService;
        normallyInService = newNormallyInService;
        boolean oldNormallyInServiceESet = normallyInServiceESet;
        normallyInServiceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE,
                    oldNormallyInService, normallyInService, !oldNormallyInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormallyInService() {
        Boolean oldNormallyInService = normallyInService;
        boolean oldNormallyInServiceESet = normallyInServiceESet;
        normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;
        normallyInServiceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE,
                    oldNormallyInService, NORMALLY_IN_SERVICE_EDEFAULT, oldNormallyInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormallyInService() {
        return normallyInServiceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ContingencyEquipment > getContingencyEquipment() {
        if( contingencyEquipment == null ) {
            contingencyEquipment = new EObjectWithInverseResolvingEList.Unsettable< ContingencyEquipment >(
                    ContingencyEquipment.class, this, CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT,
                    CimPackage.CONTINGENCY_EQUIPMENT__EQUIPMENT );
        }
        return contingencyEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetContingencyEquipment() {
        if( contingencyEquipment != null ) ( ( InternalEList.Unsettable< ? > ) contingencyEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetContingencyEquipment() {
        return contingencyEquipment != null && ( ( InternalEList.Unsettable< ? > ) contingencyEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Fault > getFaults() {
        if( faults == null ) {
            faults = new EObjectWithInverseResolvingEList.Unsettable< Fault >( Fault.class, this,
                    CimPackage.EQUIPMENT__FAULTS, CimPackage.FAULT__FAULTY_EQUIPMENT );
        }
        return faults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFaults() {
        if( faults != null ) ( ( InternalEList.Unsettable< ? > ) faults ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFaults() {
        return faults != null && ( ( InternalEList.Unsettable< ? > ) faults ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< UsagePoint > getUsagePoints() {
        if( usagePoints == null ) {
            usagePoints = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< UsagePoint >( UsagePoint.class,
                    this, CimPackage.EQUIPMENT__USAGE_POINTS, CimPackage.USAGE_POINT__EQUIPMENTS );
        }
        return usagePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUsagePoints() {
        if( usagePoints != null ) ( ( InternalEList.Unsettable< ? > ) usagePoints ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoints() {
        return usagePoints != null && ( ( InternalEList.Unsettable< ? > ) usagePoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalRestriction > getOperationalRestrictions() {
        if( operationalRestrictions == null ) {
            operationalRestrictions = new EObjectWithInverseEList.Unsettable.ManyInverse< OperationalRestriction >(
                    OperationalRestriction.class, this, CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS,
                    CimPackage.OPERATIONAL_RESTRICTION__EQUIPMENTS );
        }
        return operationalRestrictions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalRestrictions() {
        if( operationalRestrictions != null ) ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalRestrictions() {
        return operationalRestrictions != null && ( ( InternalEList.Unsettable< ? > ) operationalRestrictions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer getEquipmentContainer() {
        return equipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEquipmentContainer( EquipmentContainer newEquipmentContainer,
            NotificationChain msgs ) {
        EquipmentContainer oldEquipmentContainer = equipmentContainer;
        equipmentContainer = newEquipmentContainer;
        boolean oldEquipmentContainerESet = equipmentContainerESet;
        equipmentContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, newEquipmentContainer,
                    !oldEquipmentContainerESet );
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
    public void setEquipmentContainer( EquipmentContainer newEquipmentContainer ) {
        if( newEquipmentContainer != equipmentContainer ) {
            NotificationChain msgs = null;
            if( equipmentContainer != null ) msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                    CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            if( newEquipmentContainer != null ) msgs = ( ( InternalEObject ) newEquipmentContainer ).eInverseAdd( this,
                    CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            msgs = basicSetEquipmentContainer( newEquipmentContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentContainerESet = equipmentContainerESet;
            equipmentContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER,
                        newEquipmentContainer, newEquipmentContainer, !oldEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEquipmentContainer( NotificationChain msgs ) {
        EquipmentContainer oldEquipmentContainer = equipmentContainer;
        equipmentContainer = null;
        boolean oldEquipmentContainerESet = equipmentContainerESet;
        equipmentContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, null, oldEquipmentContainerESet );
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
    public void unsetEquipmentContainer() {
        if( equipmentContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                    CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            msgs = basicUnsetEquipmentContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentContainerESet = equipmentContainerESet;
            equipmentContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER, null, null, oldEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipmentContainer() {
        return equipmentContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Outage > getOutages() {
        if( outages == null ) {
            outages = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Outage >( Outage.class, this,
                    CimPackage.EQUIPMENT__OUTAGES, CimPackage.OUTAGE__EQUIPMENTS );
        }
        return outages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutages() {
        if( outages != null ) ( ( InternalEList.Unsettable< ? > ) outages ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutages() {
        return outages != null && ( ( InternalEList.Unsettable< ? > ) outages ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalLimitSet > getOperationalLimitSet() {
        if( operationalLimitSet == null ) {
            operationalLimitSet = new EObjectWithInverseResolvingEList.Unsettable< OperationalLimitSet >(
                    OperationalLimitSet.class, this, CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT );
        }
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalLimitSet() {
        if( operationalLimitSet != null ) ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitSet() {
        return operationalLimitSet != null && ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).isSet();
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
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getContingencyEquipment() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.EQUIPMENT__FAULTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFaults() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalRestrictions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            if( equipmentContainer != null ) msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                    CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            return basicSetEquipmentContainer( ( EquipmentContainer ) otherEnd, msgs );
        case CimPackage.EQUIPMENT__OUTAGES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutages() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalLimitSet() )
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
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            return ( ( InternalEList< ? > ) getContingencyEquipment() ).basicRemove( otherEnd, msgs );
        case CimPackage.EQUIPMENT__FAULTS:
            return ( ( InternalEList< ? > ) getFaults() ).basicRemove( otherEnd, msgs );
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            return ( ( InternalEList< ? > ) getOperationalRestrictions() ).basicRemove( otherEnd, msgs );
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return basicUnsetEquipmentContainer( msgs );
        case CimPackage.EQUIPMENT__OUTAGES:
            return ( ( InternalEList< ? > ) getOutages() ).basicRemove( otherEnd, msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< ? > ) getOperationalLimitSet() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.EQUIPMENT__AGGREGATE:
            return getAggregate();
        case CimPackage.EQUIPMENT__IN_SERVICE:
            return getInService();
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            return getNormallyInService();
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            return getContingencyEquipment();
        case CimPackage.EQUIPMENT__FAULTS:
            return getFaults();
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            return getOperationalRestrictions();
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return getEquipmentContainer();
        case CimPackage.EQUIPMENT__OUTAGES:
            return getOutages();
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return getOperationalLimitSet();
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
        case CimPackage.EQUIPMENT__AGGREGATE:
            setAggregate( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIPMENT__IN_SERVICE:
            setInService( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            setNormallyInService( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            getContingencyEquipment().clear();
            getContingencyEquipment().addAll( ( Collection< ? extends ContingencyEquipment > ) newValue );
            return;
        case CimPackage.EQUIPMENT__FAULTS:
            getFaults().clear();
            getFaults().addAll( ( Collection< ? extends Fault > ) newValue );
            return;
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            getOperationalRestrictions().clear();
            getOperationalRestrictions().addAll( ( Collection< ? extends OperationalRestriction > ) newValue );
            return;
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            setEquipmentContainer( ( EquipmentContainer ) newValue );
            return;
        case CimPackage.EQUIPMENT__OUTAGES:
            getOutages().clear();
            getOutages().addAll( ( Collection< ? extends Outage > ) newValue );
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            getOperationalLimitSet().clear();
            getOperationalLimitSet().addAll( ( Collection< ? extends OperationalLimitSet > ) newValue );
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
        case CimPackage.EQUIPMENT__AGGREGATE:
            unsetAggregate();
            return;
        case CimPackage.EQUIPMENT__IN_SERVICE:
            unsetInService();
            return;
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            unsetNormallyInService();
            return;
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            unsetContingencyEquipment();
            return;
        case CimPackage.EQUIPMENT__FAULTS:
            unsetFaults();
            return;
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            unsetOperationalRestrictions();
            return;
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            unsetEquipmentContainer();
            return;
        case CimPackage.EQUIPMENT__OUTAGES:
            unsetOutages();
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            unsetOperationalLimitSet();
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
        case CimPackage.EQUIPMENT__AGGREGATE:
            return isSetAggregate();
        case CimPackage.EQUIPMENT__IN_SERVICE:
            return isSetInService();
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            return isSetNormallyInService();
        case CimPackage.EQUIPMENT__CONTINGENCY_EQUIPMENT:
            return isSetContingencyEquipment();
        case CimPackage.EQUIPMENT__FAULTS:
            return isSetFaults();
        case CimPackage.EQUIPMENT__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.EQUIPMENT__OPERATIONAL_RESTRICTIONS:
            return isSetOperationalRestrictions();
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return isSetEquipmentContainer();
        case CimPackage.EQUIPMENT__OUTAGES:
            return isSetOutages();
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return isSetOperationalLimitSet();
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
        result.append( " (aggregate: " );
        if( aggregateESet )
            result.append( aggregate );
        else
            result.append( "<unset>" );
        result.append( ", inService: " );
        if( inServiceESet )
            result.append( inService );
        else
            result.append( "<unset>" );
        result.append( ", normallyInService: " );
        if( normallyInServiceESet )
            result.append( normallyInService );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EquipmentImpl
