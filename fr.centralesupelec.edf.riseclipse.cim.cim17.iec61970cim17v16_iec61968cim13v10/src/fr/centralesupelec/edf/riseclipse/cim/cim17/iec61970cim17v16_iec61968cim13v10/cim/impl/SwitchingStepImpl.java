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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Operator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switching Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getExecutedDateTime <em>Executed Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getIsFreeSequence <em>Is Free Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getPlannedDateTime <em>Planned Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepImpl#getCrewMember <em>Crew Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingStepImpl extends CimObjectWithIDImpl implements SwitchingStep {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descriptionESet;

    /**
     * The default value of the '{@link #getExecutedDateTime() <em>Executed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date EXECUTED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutedDateTime() <em>Executed Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutedDateTime()
     * @generated
     * @ordered
     */
    protected Date executedDateTime = EXECUTED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Executed Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean executedDateTimeESet;

    /**
     * The default value of the '{@link #getIsFreeSequence() <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFreeSequence()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_FREE_SEQUENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsFreeSequence() <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFreeSequence()
     * @generated
     * @ordered
     */
    protected Boolean isFreeSequence = IS_FREE_SEQUENCE_EDEFAULT;

    /**
     * This is true if the Is Free Sequence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isFreeSequenceESet;

    /**
     * The default value of the '{@link #getIssuedDateTime() <em>Issued Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date ISSUED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIssuedDateTime() <em>Issued Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedDateTime()
     * @generated
     * @ordered
     */
    protected Date issuedDateTime = ISSUED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Issued Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuedDateTimeESet;

    /**
     * The default value of the '{@link #getPlannedDateTime() <em>Planned Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date PLANNED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlannedDateTime() <em>Planned Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedDateTime()
     * @generated
     * @ordered
     */
    protected Date plannedDateTime = PLANNED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Planned Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plannedDateTimeESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected Integer sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected Operator operator;

    /**
     * This is true if the Operator reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatorESet;

    /**
     * The cached value of the '{@link #getCrewMember() <em>Crew Member</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewMember()
     * @generated
     * @ordered
     */
    protected CrewMember crewMember;

    /**
     * This is true if the Crew Member reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crewMemberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchingStepImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchingStep();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDescription( String newDescription ) {
        String oldDescription = description;
        description = newDescription;
        boolean oldDescriptionESet = descriptionESet;
        descriptionESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCHING_STEP__DESCRIPTION, oldDescription, description, !oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDescription() {
        String oldDescription = description;
        boolean oldDescriptionESet = descriptionESet;
        description = DESCRIPTION_EDEFAULT;
        descriptionESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCHING_STEP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDescription() {
        return descriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getExecutedDateTime() {
        return executedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExecutedDateTime( Date newExecutedDateTime ) {
        Date oldExecutedDateTime = executedDateTime;
        executedDateTime = newExecutedDateTime;
        boolean oldExecutedDateTimeESet = executedDateTimeESet;
        executedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME,
                    oldExecutedDateTime, executedDateTime, !oldExecutedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExecutedDateTime() {
        Date oldExecutedDateTime = executedDateTime;
        boolean oldExecutedDateTimeESet = executedDateTimeESet;
        executedDateTime = EXECUTED_DATE_TIME_EDEFAULT;
        executedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME,
                    oldExecutedDateTime, EXECUTED_DATE_TIME_EDEFAULT, oldExecutedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExecutedDateTime() {
        return executedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsFreeSequence() {
        return isFreeSequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsFreeSequence( Boolean newIsFreeSequence ) {
        Boolean oldIsFreeSequence = isFreeSequence;
        isFreeSequence = newIsFreeSequence;
        boolean oldIsFreeSequenceESet = isFreeSequenceESet;
        isFreeSequenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE,
                    oldIsFreeSequence, isFreeSequence, !oldIsFreeSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsFreeSequence() {
        Boolean oldIsFreeSequence = isFreeSequence;
        boolean oldIsFreeSequenceESet = isFreeSequenceESet;
        isFreeSequence = IS_FREE_SEQUENCE_EDEFAULT;
        isFreeSequenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE,
                    oldIsFreeSequence, IS_FREE_SEQUENCE_EDEFAULT, oldIsFreeSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsFreeSequence() {
        return isFreeSequenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getIssuedDateTime() {
        return issuedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIssuedDateTime( Date newIssuedDateTime ) {
        Date oldIssuedDateTime = issuedDateTime;
        issuedDateTime = newIssuedDateTime;
        boolean oldIssuedDateTimeESet = issuedDateTimeESet;
        issuedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME,
                    oldIssuedDateTime, issuedDateTime, !oldIssuedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIssuedDateTime() {
        Date oldIssuedDateTime = issuedDateTime;
        boolean oldIssuedDateTimeESet = issuedDateTimeESet;
        issuedDateTime = ISSUED_DATE_TIME_EDEFAULT;
        issuedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME,
                    oldIssuedDateTime, ISSUED_DATE_TIME_EDEFAULT, oldIssuedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuedDateTime() {
        return issuedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getPlannedDateTime() {
        return plannedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlannedDateTime( Date newPlannedDateTime ) {
        Date oldPlannedDateTime = plannedDateTime;
        plannedDateTime = newPlannedDateTime;
        boolean oldPlannedDateTimeESet = plannedDateTimeESet;
        plannedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME,
                    oldPlannedDateTime, plannedDateTime, !oldPlannedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlannedDateTime() {
        Date oldPlannedDateTime = plannedDateTime;
        boolean oldPlannedDateTimeESet = plannedDateTimeESet;
        plannedDateTime = PLANNED_DATE_TIME_EDEFAULT;
        plannedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME,
                    oldPlannedDateTime, PLANNED_DATE_TIME_EDEFAULT, oldPlannedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlannedDateTime() {
        return plannedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( Integer newSequenceNumber ) {
        Integer oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER,
                    oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        Integer oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Operator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperator( Operator newOperator, NotificationChain msgs ) {
        Operator oldOperator = operator;
        operator = newOperator;
        boolean oldOperatorESet = operatorESet;
        operatorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_STEP__OPERATOR, oldOperator, newOperator, !oldOperatorESet );
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
    public void setOperator( Operator newOperator ) {
        if( newOperator != operator ) {
            NotificationChain msgs = null;
            if( operator != null ) msgs = ( ( InternalEObject ) operator ).eInverseRemove( this,
                    CimPackage.OPERATOR__SWITCHING_STEPS, Operator.class, msgs );
            if( newOperator != null ) msgs = ( ( InternalEObject ) newOperator ).eInverseAdd( this,
                    CimPackage.OPERATOR__SWITCHING_STEPS, Operator.class, msgs );
            msgs = basicSetOperator( newOperator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatorESet = operatorESet;
            operatorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_STEP__OPERATOR, newOperator, newOperator, !oldOperatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperator( NotificationChain msgs ) {
        Operator oldOperator = operator;
        operator = null;
        boolean oldOperatorESet = operatorESet;
        operatorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP__OPERATOR, oldOperator, null, oldOperatorESet );
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
    public void unsetOperator() {
        if( operator != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operator ).eInverseRemove( this, CimPackage.OPERATOR__SWITCHING_STEPS,
                    Operator.class, msgs );
            msgs = basicUnsetOperator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatorESet = operatorESet;
            operatorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP__OPERATOR, null, null, oldOperatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperator() {
        return operatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrewMember getCrewMember() {
        return crewMember;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCrewMember( CrewMember newCrewMember, NotificationChain msgs ) {
        CrewMember oldCrewMember = crewMember;
        crewMember = newCrewMember;
        boolean oldCrewMemberESet = crewMemberESet;
        crewMemberESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_STEP__CREW_MEMBER, oldCrewMember, newCrewMember, !oldCrewMemberESet );
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
    public void setCrewMember( CrewMember newCrewMember ) {
        if( newCrewMember != crewMember ) {
            NotificationChain msgs = null;
            if( crewMember != null ) msgs = ( ( InternalEObject ) crewMember ).eInverseRemove( this,
                    CimPackage.CREW_MEMBER__SWITCHING_STEPS, CrewMember.class, msgs );
            if( newCrewMember != null ) msgs = ( ( InternalEObject ) newCrewMember ).eInverseAdd( this,
                    CimPackage.CREW_MEMBER__SWITCHING_STEPS, CrewMember.class, msgs );
            msgs = basicSetCrewMember( newCrewMember, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewMemberESet = crewMemberESet;
            crewMemberESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_STEP__CREW_MEMBER, newCrewMember, newCrewMember, !oldCrewMemberESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCrewMember( NotificationChain msgs ) {
        CrewMember oldCrewMember = crewMember;
        crewMember = null;
        boolean oldCrewMemberESet = crewMemberESet;
        crewMemberESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP__CREW_MEMBER, oldCrewMember, null, oldCrewMemberESet );
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
    public void unsetCrewMember() {
        if( crewMember != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) crewMember ).eInverseRemove( this, CimPackage.CREW_MEMBER__SWITCHING_STEPS,
                    CrewMember.class, msgs );
            msgs = basicUnsetCrewMember( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewMemberESet = crewMemberESet;
            crewMemberESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP__CREW_MEMBER, null, null, oldCrewMemberESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrewMember() {
        return crewMemberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SWITCHING_STEP__OPERATOR:
            if( operator != null ) msgs = ( ( InternalEObject ) operator ).eInverseRemove( this,
                    CimPackage.OPERATOR__SWITCHING_STEPS, Operator.class, msgs );
            return basicSetOperator( ( Operator ) otherEnd, msgs );
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            if( crewMember != null ) msgs = ( ( InternalEObject ) crewMember ).eInverseRemove( this,
                    CimPackage.CREW_MEMBER__SWITCHING_STEPS, CrewMember.class, msgs );
            return basicSetCrewMember( ( CrewMember ) otherEnd, msgs );
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
        case CimPackage.SWITCHING_STEP__OPERATOR:
            return basicUnsetOperator( msgs );
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            return basicUnsetCrewMember( msgs );
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
        case CimPackage.SWITCHING_STEP__DESCRIPTION:
            return getDescription();
        case CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME:
            return getExecutedDateTime();
        case CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE:
            return getIsFreeSequence();
        case CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME:
            return getIssuedDateTime();
        case CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME:
            return getPlannedDateTime();
        case CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.SWITCHING_STEP__OPERATOR:
            return getOperator();
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            return getCrewMember();
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
        case CimPackage.SWITCHING_STEP__DESCRIPTION:
            setDescription( ( String ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME:
            setExecutedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE:
            setIsFreeSequence( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME:
            setIssuedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME:
            setPlannedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__OPERATOR:
            setOperator( ( Operator ) newValue );
            return;
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            setCrewMember( ( CrewMember ) newValue );
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
        case CimPackage.SWITCHING_STEP__DESCRIPTION:
            unsetDescription();
            return;
        case CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME:
            unsetExecutedDateTime();
            return;
        case CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE:
            unsetIsFreeSequence();
            return;
        case CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME:
            unsetIssuedDateTime();
            return;
        case CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME:
            unsetPlannedDateTime();
            return;
        case CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.SWITCHING_STEP__OPERATOR:
            unsetOperator();
            return;
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            unsetCrewMember();
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
        case CimPackage.SWITCHING_STEP__DESCRIPTION:
            return isSetDescription();
        case CimPackage.SWITCHING_STEP__EXECUTED_DATE_TIME:
            return isSetExecutedDateTime();
        case CimPackage.SWITCHING_STEP__IS_FREE_SEQUENCE:
            return isSetIsFreeSequence();
        case CimPackage.SWITCHING_STEP__ISSUED_DATE_TIME:
            return isSetIssuedDateTime();
        case CimPackage.SWITCHING_STEP__PLANNED_DATE_TIME:
            return isSetPlannedDateTime();
        case CimPackage.SWITCHING_STEP__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.SWITCHING_STEP__OPERATOR:
            return isSetOperator();
        case CimPackage.SWITCHING_STEP__CREW_MEMBER:
            return isSetCrewMember();
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
        result.append( " (description: " );
        if( descriptionESet )
            result.append( description );
        else
            result.append( "<unset>" );
        result.append( ", executedDateTime: " );
        if( executedDateTimeESet )
            result.append( executedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", isFreeSequence: " );
        if( isFreeSequenceESet )
            result.append( isFreeSequence );
        else
            result.append( "<unset>" );
        result.append( ", issuedDateTime: " );
        if( issuedDateTimeESet )
            result.append( issuedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", plannedDateTime: " );
        if( plannedDateTimeESet )
            result.append( plannedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchingStepImpl
