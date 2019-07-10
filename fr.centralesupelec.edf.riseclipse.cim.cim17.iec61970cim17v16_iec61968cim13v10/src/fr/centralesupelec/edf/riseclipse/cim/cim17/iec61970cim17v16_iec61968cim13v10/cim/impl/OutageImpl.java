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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewStatusKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalUpdatedRating;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageArea;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageCauseKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OutageStatusKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Outage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getCancelledDateTime <em>Cancelled Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getCauseKind <em>Cause Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getCommunityDescriptor <em>Community Descriptor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getCustomersRestored <em>Customers Restored</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getMetersAffected <em>Meters Affected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOriginalCustomersServed <em>Original Customers Served</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOriginalMetersAffected <em>Original Meters Affected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOutageKind <em>Outage Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getUtilityDisclaimer <em>Utility Disclaimer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getActualPeriod <em>Actual Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getEstimatedPeriod <em>Estimated Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOpenedSwitches <em>Opened Switches</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getSwitchingPlans <em>Switching Plans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getEstimatedRestorationTime <em>Estimated Restoration Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getUpdatedRatings <em>Updated Ratings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOutageArea <em>Outage Area</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getPlannedSwitchActions <em>Planned Switch Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OutageImpl#getOutageSchedule <em>Outage Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageImpl extends DocumentImpl implements Outage {
    /**
     * The default value of the '{@link #getCancelledDateTime() <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelledDateTime()
     * @generated
     * @ordered
     */
    protected static final Date CANCELLED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCancelledDateTime() <em>Cancelled Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCancelledDateTime()
     * @generated
     * @ordered
     */
    protected Date cancelledDateTime = CANCELLED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Cancelled Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cancelledDateTimeESet;

    /**
     * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected static final String CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected String cause = CAUSE_EDEFAULT;

    /**
     * This is true if the Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean causeESet;

    /**
     * The default value of the '{@link #getCauseKind() <em>Cause Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCauseKind()
     * @generated
     * @ordered
     */
    protected static final OutageCauseKind CAUSE_KIND_EDEFAULT = OutageCauseKind.PLANNED;

    /**
     * The cached value of the '{@link #getCauseKind() <em>Cause Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCauseKind()
     * @generated
     * @ordered
     */
    protected OutageCauseKind causeKind = CAUSE_KIND_EDEFAULT;

    /**
     * This is true if the Cause Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean causeKindESet;

    /**
     * The default value of the '{@link #getCommunityDescriptor() <em>Community Descriptor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunityDescriptor()
     * @generated
     * @ordered
     */
    protected static final String COMMUNITY_DESCRIPTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCommunityDescriptor() <em>Community Descriptor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommunityDescriptor()
     * @generated
     * @ordered
     */
    protected String communityDescriptor = COMMUNITY_DESCRIPTOR_EDEFAULT;

    /**
     * This is true if the Community Descriptor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean communityDescriptorESet;

    /**
     * The default value of the '{@link #getCustomersRestored() <em>Customers Restored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomersRestored()
     * @generated
     * @ordered
     */
    protected static final Integer CUSTOMERS_RESTORED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCustomersRestored() <em>Customers Restored</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomersRestored()
     * @generated
     * @ordered
     */
    protected Integer customersRestored = CUSTOMERS_RESTORED_EDEFAULT;

    /**
     * This is true if the Customers Restored attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customersRestoredESet;

    /**
     * The default value of the '{@link #getIsPlanned() <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPlanned()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PLANNED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPlanned() <em>Is Planned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPlanned()
     * @generated
     * @ordered
     */
    protected Boolean isPlanned = IS_PLANNED_EDEFAULT;

    /**
     * This is true if the Is Planned attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPlannedESet;

    /**
     * The default value of the '{@link #getMetersAffected() <em>Meters Affected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetersAffected()
     * @generated
     * @ordered
     */
    protected static final Integer METERS_AFFECTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMetersAffected() <em>Meters Affected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetersAffected()
     * @generated
     * @ordered
     */
    protected Integer metersAffected = METERS_AFFECTED_EDEFAULT;

    /**
     * This is true if the Meters Affected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean metersAffectedESet;

    /**
     * The default value of the '{@link #getOriginalCustomersServed() <em>Original Customers Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalCustomersServed()
     * @generated
     * @ordered
     */
    protected static final Integer ORIGINAL_CUSTOMERS_SERVED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginalCustomersServed() <em>Original Customers Served</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalCustomersServed()
     * @generated
     * @ordered
     */
    protected Integer originalCustomersServed = ORIGINAL_CUSTOMERS_SERVED_EDEFAULT;

    /**
     * This is true if the Original Customers Served attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originalCustomersServedESet;

    /**
     * The default value of the '{@link #getOriginalMetersAffected() <em>Original Meters Affected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalMetersAffected()
     * @generated
     * @ordered
     */
    protected static final Integer ORIGINAL_METERS_AFFECTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginalMetersAffected() <em>Original Meters Affected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginalMetersAffected()
     * @generated
     * @ordered
     */
    protected Integer originalMetersAffected = ORIGINAL_METERS_AFFECTED_EDEFAULT;

    /**
     * This is true if the Original Meters Affected attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originalMetersAffectedESet;

    /**
     * The default value of the '{@link #getOutageKind() <em>Outage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageKind()
     * @generated
     * @ordered
     */
    protected static final OutageStatusKind OUTAGE_KIND_EDEFAULT = OutageStatusKind.CONFIRMED;

    /**
     * The cached value of the '{@link #getOutageKind() <em>Outage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageKind()
     * @generated
     * @ordered
     */
    protected OutageStatusKind outageKind = OUTAGE_KIND_EDEFAULT;

    /**
     * This is true if the Outage Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageKindESet;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Date START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Date startTime = START_TIME_EDEFAULT;

    /**
     * This is true if the Start Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startTimeESet;

    /**
     * The default value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusKind()
     * @generated
     * @ordered
     */
    protected static final CrewStatusKind STATUS_KIND_EDEFAULT = CrewStatusKind.ASSIGNED;

    /**
     * The cached value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatusKind()
     * @generated
     * @ordered
     */
    protected CrewStatusKind statusKind = STATUS_KIND_EDEFAULT;

    /**
     * This is true if the Status Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusKindESet;

    /**
     * The default value of the '{@link #getUtilityDisclaimer() <em>Utility Disclaimer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtilityDisclaimer()
     * @generated
     * @ordered
     */
    protected static final String UTILITY_DISCLAIMER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUtilityDisclaimer() <em>Utility Disclaimer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUtilityDisclaimer()
     * @generated
     * @ordered
     */
    protected String utilityDisclaimer = UTILITY_DISCLAIMER_EDEFAULT;

    /**
     * This is true if the Utility Disclaimer attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean utilityDisclaimerESet;

    /**
     * The cached value of the '{@link #getActualPeriod() <em>Actual Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualPeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval actualPeriod;

    /**
     * This is true if the Actual Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean actualPeriodESet;

    /**
     * The cached value of the '{@link #getEstimatedPeriod() <em>Estimated Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedPeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval estimatedPeriod;

    /**
     * This is true if the Estimated Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedPeriodESet;

    /**
     * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSummary()
     * @generated
     * @ordered
     */
    protected ServicePointOutageSummary summary;

    /**
     * This is true if the Summary containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean summaryESet;

    /**
     * The cached value of the '{@link #getOpenedSwitches() <em>Opened Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenedSwitches()
     * @generated
     * @ordered
     */
    protected EList< Switch > openedSwitches;

    /**
     * The cached value of the '{@link #getSwitchingPlans() <em>Switching Plans</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlans()
     * @generated
     * @ordered
     */
    protected EList< SwitchingPlan > switchingPlans;

    /**
     * The cached value of the '{@link #getEstimatedRestorationTime() <em>Estimated Restoration Time</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedRestorationTime()
     * @generated
     * @ordered
     */
    protected EstimatedRestorationTime estimatedRestorationTime;

    /**
     * This is true if the Estimated Restoration Time reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedRestorationTimeESet;

    /**
     * The cached value of the '{@link #getUpdatedRatings() <em>Updated Ratings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdatedRatings()
     * @generated
     * @ordered
     */
    protected EList< OperationalUpdatedRating > updatedRatings;

    /**
     * The cached value of the '{@link #getOutageArea() <em>Outage Area</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageArea()
     * @generated
     * @ordered
     */
    protected EList< OutageArea > outageArea;

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
     * The cached value of the '{@link #getPlannedSwitchActions() <em>Planned Switch Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedSwitchActions()
     * @generated
     * @ordered
     */
    protected EList< SwitchAction > plannedSwitchActions;

    /**
     * The cached value of the '{@link #getIncident() <em>Incident</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncident()
     * @generated
     * @ordered
     */
    protected EList< Incident > incident;

    /**
     * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipments()
     * @generated
     * @ordered
     */
    protected EList< Equipment > equipments;

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
     * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutageSchedule()
     * @generated
     * @ordered
     */
    protected OutageSchedule outageSchedule;

    /**
     * This is true if the Outage Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOutage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCancelledDateTime() {
        return cancelledDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCancelledDateTime( Date newCancelledDateTime ) {
        Date oldCancelledDateTime = cancelledDateTime;
        cancelledDateTime = newCancelledDateTime;
        boolean oldCancelledDateTimeESet = cancelledDateTimeESet;
        cancelledDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__CANCELLED_DATE_TIME,
                    oldCancelledDateTime, cancelledDateTime, !oldCancelledDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCancelledDateTime() {
        Date oldCancelledDateTime = cancelledDateTime;
        boolean oldCancelledDateTimeESet = cancelledDateTimeESet;
        cancelledDateTime = CANCELLED_DATE_TIME_EDEFAULT;
        cancelledDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__CANCELLED_DATE_TIME,
                    oldCancelledDateTime, CANCELLED_DATE_TIME_EDEFAULT, oldCancelledDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCancelledDateTime() {
        return cancelledDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCause() {
        return cause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCause( String newCause ) {
        String oldCause = cause;
        cause = newCause;
        boolean oldCauseESet = causeESet;
        causeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__CAUSE,
                oldCause, cause, !oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCause() {
        String oldCause = cause;
        boolean oldCauseESet = causeESet;
        cause = CAUSE_EDEFAULT;
        causeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__CAUSE, oldCause, CAUSE_EDEFAULT, oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCause() {
        return causeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutageCauseKind getCauseKind() {
        return causeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCauseKind( OutageCauseKind newCauseKind ) {
        OutageCauseKind oldCauseKind = causeKind;
        causeKind = newCauseKind == null ? CAUSE_KIND_EDEFAULT : newCauseKind;
        boolean oldCauseKindESet = causeKindESet;
        causeKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__CAUSE_KIND, oldCauseKind, causeKind, !oldCauseKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCauseKind() {
        OutageCauseKind oldCauseKind = causeKind;
        boolean oldCauseKindESet = causeKindESet;
        causeKind = CAUSE_KIND_EDEFAULT;
        causeKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__CAUSE_KIND, oldCauseKind, CAUSE_KIND_EDEFAULT, oldCauseKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCauseKind() {
        return causeKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCommunityDescriptor() {
        return communityDescriptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommunityDescriptor( String newCommunityDescriptor ) {
        String oldCommunityDescriptor = communityDescriptor;
        communityDescriptor = newCommunityDescriptor;
        boolean oldCommunityDescriptorESet = communityDescriptorESet;
        communityDescriptorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR,
                    oldCommunityDescriptor, communityDescriptor, !oldCommunityDescriptorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCommunityDescriptor() {
        String oldCommunityDescriptor = communityDescriptor;
        boolean oldCommunityDescriptorESet = communityDescriptorESet;
        communityDescriptor = COMMUNITY_DESCRIPTOR_EDEFAULT;
        communityDescriptorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR,
                    oldCommunityDescriptor, COMMUNITY_DESCRIPTOR_EDEFAULT, oldCommunityDescriptorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommunityDescriptor() {
        return communityDescriptorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCustomersRestored() {
        return customersRestored;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCustomersRestored( Integer newCustomersRestored ) {
        Integer oldCustomersRestored = customersRestored;
        customersRestored = newCustomersRestored;
        boolean oldCustomersRestoredESet = customersRestoredESet;
        customersRestoredESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__CUSTOMERS_RESTORED,
                    oldCustomersRestored, customersRestored, !oldCustomersRestoredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomersRestored() {
        Integer oldCustomersRestored = customersRestored;
        boolean oldCustomersRestoredESet = customersRestoredESet;
        customersRestored = CUSTOMERS_RESTORED_EDEFAULT;
        customersRestoredESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__CUSTOMERS_RESTORED,
                    oldCustomersRestored, CUSTOMERS_RESTORED_EDEFAULT, oldCustomersRestoredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomersRestored() {
        return customersRestoredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPlanned() {
        return isPlanned;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPlanned( Boolean newIsPlanned ) {
        Boolean oldIsPlanned = isPlanned;
        isPlanned = newIsPlanned;
        boolean oldIsPlannedESet = isPlannedESet;
        isPlannedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__IS_PLANNED, oldIsPlanned, isPlanned, !oldIsPlannedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPlanned() {
        Boolean oldIsPlanned = isPlanned;
        boolean oldIsPlannedESet = isPlannedESet;
        isPlanned = IS_PLANNED_EDEFAULT;
        isPlannedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__IS_PLANNED, oldIsPlanned, IS_PLANNED_EDEFAULT, oldIsPlannedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPlanned() {
        return isPlannedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMetersAffected() {
        return metersAffected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMetersAffected( Integer newMetersAffected ) {
        Integer oldMetersAffected = metersAffected;
        metersAffected = newMetersAffected;
        boolean oldMetersAffectedESet = metersAffectedESet;
        metersAffectedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__METERS_AFFECTED, oldMetersAffected, metersAffected, !oldMetersAffectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMetersAffected() {
        Integer oldMetersAffected = metersAffected;
        boolean oldMetersAffectedESet = metersAffectedESet;
        metersAffected = METERS_AFFECTED_EDEFAULT;
        metersAffectedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__METERS_AFFECTED,
                    oldMetersAffected, METERS_AFFECTED_EDEFAULT, oldMetersAffectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMetersAffected() {
        return metersAffectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOriginalCustomersServed() {
        return originalCustomersServed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginalCustomersServed( Integer newOriginalCustomersServed ) {
        Integer oldOriginalCustomersServed = originalCustomersServed;
        originalCustomersServed = newOriginalCustomersServed;
        boolean oldOriginalCustomersServedESet = originalCustomersServedESet;
        originalCustomersServedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED,
                    oldOriginalCustomersServed, originalCustomersServed, !oldOriginalCustomersServedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginalCustomersServed() {
        Integer oldOriginalCustomersServed = originalCustomersServed;
        boolean oldOriginalCustomersServedESet = originalCustomersServedESet;
        originalCustomersServed = ORIGINAL_CUSTOMERS_SERVED_EDEFAULT;
        originalCustomersServedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED,
                    oldOriginalCustomersServed, ORIGINAL_CUSTOMERS_SERVED_EDEFAULT, oldOriginalCustomersServedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginalCustomersServed() {
        return originalCustomersServedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOriginalMetersAffected() {
        return originalMetersAffected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginalMetersAffected( Integer newOriginalMetersAffected ) {
        Integer oldOriginalMetersAffected = originalMetersAffected;
        originalMetersAffected = newOriginalMetersAffected;
        boolean oldOriginalMetersAffectedESet = originalMetersAffectedESet;
        originalMetersAffectedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED,
                    oldOriginalMetersAffected, originalMetersAffected, !oldOriginalMetersAffectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginalMetersAffected() {
        Integer oldOriginalMetersAffected = originalMetersAffected;
        boolean oldOriginalMetersAffectedESet = originalMetersAffectedESet;
        originalMetersAffected = ORIGINAL_METERS_AFFECTED_EDEFAULT;
        originalMetersAffectedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED,
                    oldOriginalMetersAffected, ORIGINAL_METERS_AFFECTED_EDEFAULT, oldOriginalMetersAffectedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginalMetersAffected() {
        return originalMetersAffectedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OutageStatusKind getOutageKind() {
        return outageKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutageKind( OutageStatusKind newOutageKind ) {
        OutageStatusKind oldOutageKind = outageKind;
        outageKind = newOutageKind == null ? OUTAGE_KIND_EDEFAULT : newOutageKind;
        boolean oldOutageKindESet = outageKindESet;
        outageKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__OUTAGE_KIND, oldOutageKind, outageKind, !oldOutageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutageKind() {
        OutageStatusKind oldOutageKind = outageKind;
        boolean oldOutageKindESet = outageKindESet;
        outageKind = OUTAGE_KIND_EDEFAULT;
        outageKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__OUTAGE_KIND, oldOutageKind, OUTAGE_KIND_EDEFAULT, oldOutageKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageKind() {
        return outageKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartTime() {
        return startTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartTime( Date newStartTime ) {
        Date oldStartTime = startTime;
        startTime = newStartTime;
        boolean oldStartTimeESet = startTimeESet;
        startTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__START_TIME, oldStartTime, startTime, !oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartTime() {
        Date oldStartTime = startTime;
        boolean oldStartTimeESet = startTimeESet;
        startTime = START_TIME_EDEFAULT;
        startTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__START_TIME, oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartTime() {
        return startTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrewStatusKind getStatusKind() {
        return statusKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatusKind( CrewStatusKind newStatusKind ) {
        CrewStatusKind oldStatusKind = statusKind;
        statusKind = newStatusKind == null ? STATUS_KIND_EDEFAULT : newStatusKind;
        boolean oldStatusKindESet = statusKindESet;
        statusKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.OUTAGE__STATUS_KIND, oldStatusKind, statusKind, !oldStatusKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatusKind() {
        CrewStatusKind oldStatusKind = statusKind;
        boolean oldStatusKindESet = statusKindESet;
        statusKind = STATUS_KIND_EDEFAULT;
        statusKindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.OUTAGE__STATUS_KIND, oldStatusKind, STATUS_KIND_EDEFAULT, oldStatusKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatusKind() {
        return statusKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUtilityDisclaimer() {
        return utilityDisclaimer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUtilityDisclaimer( String newUtilityDisclaimer ) {
        String oldUtilityDisclaimer = utilityDisclaimer;
        utilityDisclaimer = newUtilityDisclaimer;
        boolean oldUtilityDisclaimerESet = utilityDisclaimerESet;
        utilityDisclaimerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__UTILITY_DISCLAIMER,
                    oldUtilityDisclaimer, utilityDisclaimer, !oldUtilityDisclaimerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUtilityDisclaimer() {
        String oldUtilityDisclaimer = utilityDisclaimer;
        boolean oldUtilityDisclaimerESet = utilityDisclaimerESet;
        utilityDisclaimer = UTILITY_DISCLAIMER_EDEFAULT;
        utilityDisclaimerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OUTAGE__UTILITY_DISCLAIMER,
                    oldUtilityDisclaimer, UTILITY_DISCLAIMER_EDEFAULT, oldUtilityDisclaimerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUtilityDisclaimer() {
        return utilityDisclaimerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getActualPeriod() {
        return actualPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActualPeriod( DateTimeInterval newActualPeriod, NotificationChain msgs ) {
        DateTimeInterval oldActualPeriod = actualPeriod;
        actualPeriod = newActualPeriod;
        boolean oldActualPeriodESet = actualPeriodESet;
        actualPeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, oldActualPeriod, newActualPeriod, !oldActualPeriodESet );
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
    public void setActualPeriod( DateTimeInterval newActualPeriod ) {
        if( newActualPeriod != actualPeriod ) {
            NotificationChain msgs = null;
            if( actualPeriod != null ) msgs = ( ( InternalEObject ) actualPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            if( newActualPeriod != null ) msgs = ( ( InternalEObject ) newActualPeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            msgs = basicSetActualPeriod( newActualPeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActualPeriodESet = actualPeriodESet;
            actualPeriodESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, newActualPeriod, newActualPeriod, !oldActualPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetActualPeriod( NotificationChain msgs ) {
        DateTimeInterval oldActualPeriod = actualPeriod;
        actualPeriod = null;
        boolean oldActualPeriodESet = actualPeriodESet;
        actualPeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, oldActualPeriod, null, oldActualPeriodESet );
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
    public void unsetActualPeriod() {
        if( actualPeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) actualPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ACTUAL_PERIOD, null, msgs );
            msgs = basicUnsetActualPeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActualPeriodESet = actualPeriodESet;
            actualPeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ACTUAL_PERIOD, null, null, oldActualPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActualPeriod() {
        return actualPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getEstimatedPeriod() {
        return estimatedPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEstimatedPeriod( DateTimeInterval newEstimatedPeriod, NotificationChain msgs ) {
        DateTimeInterval oldEstimatedPeriod = estimatedPeriod;
        estimatedPeriod = newEstimatedPeriod;
        boolean oldEstimatedPeriodESet = estimatedPeriodESet;
        estimatedPeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, oldEstimatedPeriod, newEstimatedPeriod,
                    !oldEstimatedPeriodESet );
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
    public void setEstimatedPeriod( DateTimeInterval newEstimatedPeriod ) {
        if( newEstimatedPeriod != estimatedPeriod ) {
            NotificationChain msgs = null;
            if( estimatedPeriod != null ) msgs = ( ( InternalEObject ) estimatedPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            if( newEstimatedPeriod != null ) msgs = ( ( InternalEObject ) newEstimatedPeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            msgs = basicSetEstimatedPeriod( newEstimatedPeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedPeriodESet = estimatedPeriodESet;
            estimatedPeriodESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__ESTIMATED_PERIOD,
                        newEstimatedPeriod, newEstimatedPeriod, !oldEstimatedPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEstimatedPeriod( NotificationChain msgs ) {
        DateTimeInterval oldEstimatedPeriod = estimatedPeriod;
        estimatedPeriod = null;
        boolean oldEstimatedPeriodESet = estimatedPeriodESet;
        estimatedPeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, oldEstimatedPeriod, null, oldEstimatedPeriodESet );
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
    public void unsetEstimatedPeriod() {
        if( estimatedPeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) estimatedPeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__ESTIMATED_PERIOD, null, msgs );
            msgs = basicUnsetEstimatedPeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedPeriodESet = estimatedPeriodESet;
            estimatedPeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_PERIOD, null, null, oldEstimatedPeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedPeriod() {
        return estimatedPeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServicePointOutageSummary getSummary() {
        return summary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSummary( ServicePointOutageSummary newSummary, NotificationChain msgs ) {
        ServicePointOutageSummary oldSummary = summary;
        summary = newSummary;
        boolean oldSummaryESet = summaryESet;
        summaryESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__SUMMARY,
                    oldSummary, newSummary, !oldSummaryESet );
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
    public void setSummary( ServicePointOutageSummary newSummary ) {
        if( newSummary != summary ) {
            NotificationChain msgs = null;
            if( summary != null ) msgs = ( ( InternalEObject ) summary ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            if( newSummary != null ) msgs = ( ( InternalEObject ) newSummary ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            msgs = basicSetSummary( newSummary, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSummaryESet = summaryESet;
            summaryESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__SUMMARY, newSummary, newSummary, !oldSummaryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSummary( NotificationChain msgs ) {
        ServicePointOutageSummary oldSummary = summary;
        summary = null;
        boolean oldSummaryESet = summaryESet;
        summaryESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__SUMMARY, oldSummary, null, oldSummaryESet );
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
    public void unsetSummary() {
        if( summary != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) summary ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.OUTAGE__SUMMARY, null, msgs );
            msgs = basicUnsetSummary( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSummaryESet = summaryESet;
            summaryESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__SUMMARY, null, null, oldSummaryESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSummary() {
        return summaryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Switch > getOpenedSwitches() {
        if( openedSwitches == null ) {
            openedSwitches = new EObjectWithInverseResolvingEList.Unsettable< Switch >( Switch.class, this,
                    CimPackage.OUTAGE__OPENED_SWITCHES, CimPackage.SWITCH__OUTAGE );
        }
        return openedSwitches;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpenedSwitches() {
        if( openedSwitches != null ) ( ( InternalEList.Unsettable< ? > ) openedSwitches ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpenedSwitches() {
        return openedSwitches != null && ( ( InternalEList.Unsettable< ? > ) openedSwitches ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchingPlan > getSwitchingPlans() {
        if( switchingPlans == null ) {
            switchingPlans = new EObjectWithInverseResolvingEList.Unsettable< SwitchingPlan >( SwitchingPlan.class,
                    this, CimPackage.OUTAGE__SWITCHING_PLANS, CimPackage.SWITCHING_PLAN__OUTAGE );
        }
        return switchingPlans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingPlans() {
        if( switchingPlans != null ) ( ( InternalEList.Unsettable< ? > ) switchingPlans ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlans() {
        return switchingPlans != null && ( ( InternalEList.Unsettable< ? > ) switchingPlans ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EstimatedRestorationTime getEstimatedRestorationTime() {
        return estimatedRestorationTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEstimatedRestorationTime( EstimatedRestorationTime newEstimatedRestorationTime,
            NotificationChain msgs ) {
        EstimatedRestorationTime oldEstimatedRestorationTime = estimatedRestorationTime;
        estimatedRestorationTime = newEstimatedRestorationTime;
        boolean oldEstimatedRestorationTimeESet = estimatedRestorationTimeESet;
        estimatedRestorationTimeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME, oldEstimatedRestorationTime,
                    newEstimatedRestorationTime, !oldEstimatedRestorationTimeESet );
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
    public void setEstimatedRestorationTime( EstimatedRestorationTime newEstimatedRestorationTime ) {
        if( newEstimatedRestorationTime != estimatedRestorationTime ) {
            NotificationChain msgs = null;
            if( estimatedRestorationTime != null )
                msgs = ( ( InternalEObject ) estimatedRestorationTime ).eInverseRemove( this,
                        CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE, EstimatedRestorationTime.class, msgs );
            if( newEstimatedRestorationTime != null )
                msgs = ( ( InternalEObject ) newEstimatedRestorationTime ).eInverseAdd( this,
                        CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE, EstimatedRestorationTime.class, msgs );
            msgs = basicSetEstimatedRestorationTime( newEstimatedRestorationTime, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedRestorationTimeESet = estimatedRestorationTimeESet;
            estimatedRestorationTimeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME,
                        newEstimatedRestorationTime, newEstimatedRestorationTime, !oldEstimatedRestorationTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEstimatedRestorationTime( NotificationChain msgs ) {
        EstimatedRestorationTime oldEstimatedRestorationTime = estimatedRestorationTime;
        estimatedRestorationTime = null;
        boolean oldEstimatedRestorationTimeESet = estimatedRestorationTimeESet;
        estimatedRestorationTimeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME, oldEstimatedRestorationTime, null,
                    oldEstimatedRestorationTimeESet );
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
    public void unsetEstimatedRestorationTime() {
        if( estimatedRestorationTime != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) estimatedRestorationTime ).eInverseRemove( this,
                    CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE, EstimatedRestorationTime.class, msgs );
            msgs = basicUnsetEstimatedRestorationTime( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedRestorationTimeESet = estimatedRestorationTimeESet;
            estimatedRestorationTimeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME, null, null, oldEstimatedRestorationTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedRestorationTime() {
        return estimatedRestorationTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalUpdatedRating > getUpdatedRatings() {
        if( updatedRatings == null ) {
            updatedRatings = new EObjectWithInverseResolvingEList.Unsettable< OperationalUpdatedRating >(
                    OperationalUpdatedRating.class, this, CimPackage.OUTAGE__UPDATED_RATINGS,
                    CimPackage.OPERATIONAL_UPDATED_RATING__PLANNED_OUTAGE );
        }
        return updatedRatings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdatedRatings() {
        if( updatedRatings != null ) ( ( InternalEList.Unsettable< ? > ) updatedRatings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdatedRatings() {
        return updatedRatings != null && ( ( InternalEList.Unsettable< ? > ) updatedRatings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OutageArea > getOutageArea() {
        if( outageArea == null ) {
            outageArea = new EObjectWithInverseEList.Unsettable.ManyInverse< OutageArea >( OutageArea.class, this,
                    CimPackage.OUTAGE__OUTAGE_AREA, CimPackage.OUTAGE_AREA__OUTAGE );
        }
        return outageArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutageArea() {
        if( outageArea != null ) ( ( InternalEList.Unsettable< ? > ) outageArea ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageArea() {
        return outageArea != null && ( ( InternalEList.Unsettable< ? > ) outageArea ).isSet();
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
                    this, CimPackage.OUTAGE__USAGE_POINTS, CimPackage.USAGE_POINT__OUTAGES );
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
    public EList< SwitchAction > getPlannedSwitchActions() {
        if( plannedSwitchActions == null ) {
            plannedSwitchActions = new EObjectWithInverseResolvingEList.Unsettable< SwitchAction >( SwitchAction.class,
                    this, CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, CimPackage.SWITCH_ACTION__PLANNED_OUTAGE );
        }
        return plannedSwitchActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlannedSwitchActions() {
        if( plannedSwitchActions != null ) ( ( InternalEList.Unsettable< ? > ) plannedSwitchActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlannedSwitchActions() {
        return plannedSwitchActions != null && ( ( InternalEList.Unsettable< ? > ) plannedSwitchActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Incident > getIncident() {
        if( incident == null ) {
            incident = new EObjectWithInverseResolvingEList.Unsettable< Incident >( Incident.class, this,
                    CimPackage.OUTAGE__INCIDENT, CimPackage.INCIDENT__OUTAGE );
        }
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIncident() {
        if( incident != null ) ( ( InternalEList.Unsettable< ? > ) incident ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncident() {
        return incident != null && ( ( InternalEList.Unsettable< ? > ) incident ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Equipment > getEquipments() {
        if( equipments == null ) {
            equipments = new EObjectWithInverseEList.Unsettable.ManyInverse< Equipment >( Equipment.class, this,
                    CimPackage.OUTAGE__EQUIPMENTS, CimPackage.EQUIPMENT__OUTAGES );
        }
        return equipments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquipments() {
        if( equipments != null ) ( ( InternalEList.Unsettable< ? > ) equipments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipments() {
        return equipments != null && ( ( InternalEList.Unsettable< ? > ) equipments ).isSet();
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
                    CimPackage.OUTAGE__FAULTS, CimPackage.FAULT__OUTAGE );
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
    public OutageSchedule getOutageSchedule() {
        return outageSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutageSchedule( OutageSchedule newOutageSchedule, NotificationChain msgs ) {
        OutageSchedule oldOutageSchedule = outageSchedule;
        outageSchedule = newOutageSchedule;
        boolean oldOutageScheduleESet = outageScheduleESet;
        outageScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, oldOutageSchedule, newOutageSchedule, !oldOutageScheduleESet );
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
    public void setOutageSchedule( OutageSchedule newOutageSchedule ) {
        if( newOutageSchedule != outageSchedule ) {
            NotificationChain msgs = null;
            if( outageSchedule != null ) msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            if( newOutageSchedule != null ) msgs = ( ( InternalEObject ) newOutageSchedule ).eInverseAdd( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            msgs = basicSetOutageSchedule( newOutageSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageScheduleESet = outageScheduleESet;
            outageScheduleESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OUTAGE__OUTAGE_SCHEDULE,
                        newOutageSchedule, newOutageSchedule, !oldOutageScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutageSchedule( NotificationChain msgs ) {
        OutageSchedule oldOutageSchedule = outageSchedule;
        outageSchedule = null;
        boolean oldOutageScheduleESet = outageScheduleESet;
        outageScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, oldOutageSchedule, null, oldOutageScheduleESet );
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
    public void unsetOutageSchedule() {
        if( outageSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            msgs = basicUnsetOutageSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageScheduleESet = outageScheduleESet;
            outageScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OUTAGE__OUTAGE_SCHEDULE, null, null, oldOutageScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutageSchedule() {
        return outageScheduleESet;
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
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOpenedSwitches() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchingPlans() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            if( estimatedRestorationTime != null )
                msgs = ( ( InternalEObject ) estimatedRestorationTime ).eInverseRemove( this,
                        CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE, EstimatedRestorationTime.class, msgs );
            return basicSetEstimatedRestorationTime( ( EstimatedRestorationTime ) otherEnd, msgs );
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUpdatedRatings() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__OUTAGE_AREA:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutageArea() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__USAGE_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getUsagePoints() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPlannedSwitchActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.OUTAGE__INCIDENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIncident() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__EQUIPMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquipments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__FAULTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFaults() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            if( outageSchedule != null ) msgs = ( ( InternalEObject ) outageSchedule ).eInverseRemove( this,
                    CimPackage.OUTAGE_SCHEDULE__PLANNED_OUTAGES, OutageSchedule.class, msgs );
            return basicSetOutageSchedule( ( OutageSchedule ) otherEnd, msgs );
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
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return basicUnsetActualPeriod( msgs );
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return basicUnsetEstimatedPeriod( msgs );
        case CimPackage.OUTAGE__SUMMARY:
            return basicUnsetSummary( msgs );
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return ( ( InternalEList< ? > ) getOpenedSwitches() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return ( ( InternalEList< ? > ) getSwitchingPlans() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            return basicUnsetEstimatedRestorationTime( msgs );
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return ( ( InternalEList< ? > ) getUpdatedRatings() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__OUTAGE_AREA:
            return ( ( InternalEList< ? > ) getOutageArea() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__USAGE_POINTS:
            return ( ( InternalEList< ? > ) getUsagePoints() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return ( ( InternalEList< ? > ) getPlannedSwitchActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__INCIDENT:
            return ( ( InternalEList< ? > ) getIncident() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__EQUIPMENTS:
            return ( ( InternalEList< ? > ) getEquipments() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__FAULTS:
            return ( ( InternalEList< ? > ) getFaults() ).basicRemove( otherEnd, msgs );
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return basicUnsetOutageSchedule( msgs );
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            return getCancelledDateTime();
        case CimPackage.OUTAGE__CAUSE:
            return getCause();
        case CimPackage.OUTAGE__CAUSE_KIND:
            return getCauseKind();
        case CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR:
            return getCommunityDescriptor();
        case CimPackage.OUTAGE__CUSTOMERS_RESTORED:
            return getCustomersRestored();
        case CimPackage.OUTAGE__IS_PLANNED:
            return getIsPlanned();
        case CimPackage.OUTAGE__METERS_AFFECTED:
            return getMetersAffected();
        case CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED:
            return getOriginalCustomersServed();
        case CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED:
            return getOriginalMetersAffected();
        case CimPackage.OUTAGE__OUTAGE_KIND:
            return getOutageKind();
        case CimPackage.OUTAGE__START_TIME:
            return getStartTime();
        case CimPackage.OUTAGE__STATUS_KIND:
            return getStatusKind();
        case CimPackage.OUTAGE__UTILITY_DISCLAIMER:
            return getUtilityDisclaimer();
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return getActualPeriod();
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return getEstimatedPeriod();
        case CimPackage.OUTAGE__SUMMARY:
            return getSummary();
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return getOpenedSwitches();
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return getSwitchingPlans();
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            return getEstimatedRestorationTime();
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return getUpdatedRatings();
        case CimPackage.OUTAGE__OUTAGE_AREA:
            return getOutageArea();
        case CimPackage.OUTAGE__USAGE_POINTS:
            return getUsagePoints();
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return getPlannedSwitchActions();
        case CimPackage.OUTAGE__INCIDENT:
            return getIncident();
        case CimPackage.OUTAGE__EQUIPMENTS:
            return getEquipments();
        case CimPackage.OUTAGE__FAULTS:
            return getFaults();
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return getOutageSchedule();
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            setCancelledDateTime( ( Date ) newValue );
            return;
        case CimPackage.OUTAGE__CAUSE:
            setCause( ( String ) newValue );
            return;
        case CimPackage.OUTAGE__CAUSE_KIND:
            setCauseKind( ( OutageCauseKind ) newValue );
            return;
        case CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR:
            setCommunityDescriptor( ( String ) newValue );
            return;
        case CimPackage.OUTAGE__CUSTOMERS_RESTORED:
            setCustomersRestored( ( Integer ) newValue );
            return;
        case CimPackage.OUTAGE__IS_PLANNED:
            setIsPlanned( ( Boolean ) newValue );
            return;
        case CimPackage.OUTAGE__METERS_AFFECTED:
            setMetersAffected( ( Integer ) newValue );
            return;
        case CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED:
            setOriginalCustomersServed( ( Integer ) newValue );
            return;
        case CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED:
            setOriginalMetersAffected( ( Integer ) newValue );
            return;
        case CimPackage.OUTAGE__OUTAGE_KIND:
            setOutageKind( ( OutageStatusKind ) newValue );
            return;
        case CimPackage.OUTAGE__START_TIME:
            setStartTime( ( Date ) newValue );
            return;
        case CimPackage.OUTAGE__STATUS_KIND:
            setStatusKind( ( CrewStatusKind ) newValue );
            return;
        case CimPackage.OUTAGE__UTILITY_DISCLAIMER:
            setUtilityDisclaimer( ( String ) newValue );
            return;
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            setActualPeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            setEstimatedPeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.OUTAGE__SUMMARY:
            setSummary( ( ServicePointOutageSummary ) newValue );
            return;
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            getOpenedSwitches().clear();
            getOpenedSwitches().addAll( ( Collection< ? extends Switch > ) newValue );
            return;
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            getSwitchingPlans().clear();
            getSwitchingPlans().addAll( ( Collection< ? extends SwitchingPlan > ) newValue );
            return;
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            setEstimatedRestorationTime( ( EstimatedRestorationTime ) newValue );
            return;
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            getUpdatedRatings().clear();
            getUpdatedRatings().addAll( ( Collection< ? extends OperationalUpdatedRating > ) newValue );
            return;
        case CimPackage.OUTAGE__OUTAGE_AREA:
            getOutageArea().clear();
            getOutageArea().addAll( ( Collection< ? extends OutageArea > ) newValue );
            return;
        case CimPackage.OUTAGE__USAGE_POINTS:
            getUsagePoints().clear();
            getUsagePoints().addAll( ( Collection< ? extends UsagePoint > ) newValue );
            return;
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            getPlannedSwitchActions().clear();
            getPlannedSwitchActions().addAll( ( Collection< ? extends SwitchAction > ) newValue );
            return;
        case CimPackage.OUTAGE__INCIDENT:
            getIncident().clear();
            getIncident().addAll( ( Collection< ? extends Incident > ) newValue );
            return;
        case CimPackage.OUTAGE__EQUIPMENTS:
            getEquipments().clear();
            getEquipments().addAll( ( Collection< ? extends Equipment > ) newValue );
            return;
        case CimPackage.OUTAGE__FAULTS:
            getFaults().clear();
            getFaults().addAll( ( Collection< ? extends Fault > ) newValue );
            return;
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            setOutageSchedule( ( OutageSchedule ) newValue );
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            unsetCancelledDateTime();
            return;
        case CimPackage.OUTAGE__CAUSE:
            unsetCause();
            return;
        case CimPackage.OUTAGE__CAUSE_KIND:
            unsetCauseKind();
            return;
        case CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR:
            unsetCommunityDescriptor();
            return;
        case CimPackage.OUTAGE__CUSTOMERS_RESTORED:
            unsetCustomersRestored();
            return;
        case CimPackage.OUTAGE__IS_PLANNED:
            unsetIsPlanned();
            return;
        case CimPackage.OUTAGE__METERS_AFFECTED:
            unsetMetersAffected();
            return;
        case CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED:
            unsetOriginalCustomersServed();
            return;
        case CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED:
            unsetOriginalMetersAffected();
            return;
        case CimPackage.OUTAGE__OUTAGE_KIND:
            unsetOutageKind();
            return;
        case CimPackage.OUTAGE__START_TIME:
            unsetStartTime();
            return;
        case CimPackage.OUTAGE__STATUS_KIND:
            unsetStatusKind();
            return;
        case CimPackage.OUTAGE__UTILITY_DISCLAIMER:
            unsetUtilityDisclaimer();
            return;
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            unsetActualPeriod();
            return;
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            unsetEstimatedPeriod();
            return;
        case CimPackage.OUTAGE__SUMMARY:
            unsetSummary();
            return;
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            unsetOpenedSwitches();
            return;
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            unsetSwitchingPlans();
            return;
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            unsetEstimatedRestorationTime();
            return;
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            unsetUpdatedRatings();
            return;
        case CimPackage.OUTAGE__OUTAGE_AREA:
            unsetOutageArea();
            return;
        case CimPackage.OUTAGE__USAGE_POINTS:
            unsetUsagePoints();
            return;
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            unsetPlannedSwitchActions();
            return;
        case CimPackage.OUTAGE__INCIDENT:
            unsetIncident();
            return;
        case CimPackage.OUTAGE__EQUIPMENTS:
            unsetEquipments();
            return;
        case CimPackage.OUTAGE__FAULTS:
            unsetFaults();
            return;
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            unsetOutageSchedule();
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
        case CimPackage.OUTAGE__CANCELLED_DATE_TIME:
            return isSetCancelledDateTime();
        case CimPackage.OUTAGE__CAUSE:
            return isSetCause();
        case CimPackage.OUTAGE__CAUSE_KIND:
            return isSetCauseKind();
        case CimPackage.OUTAGE__COMMUNITY_DESCRIPTOR:
            return isSetCommunityDescriptor();
        case CimPackage.OUTAGE__CUSTOMERS_RESTORED:
            return isSetCustomersRestored();
        case CimPackage.OUTAGE__IS_PLANNED:
            return isSetIsPlanned();
        case CimPackage.OUTAGE__METERS_AFFECTED:
            return isSetMetersAffected();
        case CimPackage.OUTAGE__ORIGINAL_CUSTOMERS_SERVED:
            return isSetOriginalCustomersServed();
        case CimPackage.OUTAGE__ORIGINAL_METERS_AFFECTED:
            return isSetOriginalMetersAffected();
        case CimPackage.OUTAGE__OUTAGE_KIND:
            return isSetOutageKind();
        case CimPackage.OUTAGE__START_TIME:
            return isSetStartTime();
        case CimPackage.OUTAGE__STATUS_KIND:
            return isSetStatusKind();
        case CimPackage.OUTAGE__UTILITY_DISCLAIMER:
            return isSetUtilityDisclaimer();
        case CimPackage.OUTAGE__ACTUAL_PERIOD:
            return isSetActualPeriod();
        case CimPackage.OUTAGE__ESTIMATED_PERIOD:
            return isSetEstimatedPeriod();
        case CimPackage.OUTAGE__SUMMARY:
            return isSetSummary();
        case CimPackage.OUTAGE__OPENED_SWITCHES:
            return isSetOpenedSwitches();
        case CimPackage.OUTAGE__SWITCHING_PLANS:
            return isSetSwitchingPlans();
        case CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME:
            return isSetEstimatedRestorationTime();
        case CimPackage.OUTAGE__UPDATED_RATINGS:
            return isSetUpdatedRatings();
        case CimPackage.OUTAGE__OUTAGE_AREA:
            return isSetOutageArea();
        case CimPackage.OUTAGE__USAGE_POINTS:
            return isSetUsagePoints();
        case CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS:
            return isSetPlannedSwitchActions();
        case CimPackage.OUTAGE__INCIDENT:
            return isSetIncident();
        case CimPackage.OUTAGE__EQUIPMENTS:
            return isSetEquipments();
        case CimPackage.OUTAGE__FAULTS:
            return isSetFaults();
        case CimPackage.OUTAGE__OUTAGE_SCHEDULE:
            return isSetOutageSchedule();
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
        result.append( " (cancelledDateTime: " );
        if( cancelledDateTimeESet )
            result.append( cancelledDateTime );
        else
            result.append( "<unset>" );
        result.append( ", cause: " );
        if( causeESet )
            result.append( cause );
        else
            result.append( "<unset>" );
        result.append( ", causeKind: " );
        if( causeKindESet )
            result.append( causeKind );
        else
            result.append( "<unset>" );
        result.append( ", communityDescriptor: " );
        if( communityDescriptorESet )
            result.append( communityDescriptor );
        else
            result.append( "<unset>" );
        result.append( ", customersRestored: " );
        if( customersRestoredESet )
            result.append( customersRestored );
        else
            result.append( "<unset>" );
        result.append( ", isPlanned: " );
        if( isPlannedESet )
            result.append( isPlanned );
        else
            result.append( "<unset>" );
        result.append( ", metersAffected: " );
        if( metersAffectedESet )
            result.append( metersAffected );
        else
            result.append( "<unset>" );
        result.append( ", originalCustomersServed: " );
        if( originalCustomersServedESet )
            result.append( originalCustomersServed );
        else
            result.append( "<unset>" );
        result.append( ", originalMetersAffected: " );
        if( originalMetersAffectedESet )
            result.append( originalMetersAffected );
        else
            result.append( "<unset>" );
        result.append( ", outageKind: " );
        if( outageKindESet )
            result.append( outageKind );
        else
            result.append( "<unset>" );
        result.append( ", startTime: " );
        if( startTimeESet )
            result.append( startTime );
        else
            result.append( "<unset>" );
        result.append( ", statusKind: " );
        if( statusKindESet )
            result.append( statusKind );
        else
            result.append( "<unset>" );
        result.append( ", utilityDisclaimer: " );
        if( utilityDisclaimerESet )
            result.append( utilityDisclaimer );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OutageImpl
