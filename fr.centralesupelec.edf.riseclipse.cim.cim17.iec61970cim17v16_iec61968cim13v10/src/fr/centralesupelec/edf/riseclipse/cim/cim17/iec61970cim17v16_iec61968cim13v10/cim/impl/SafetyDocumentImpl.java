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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FieldSafetySupervisor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getReleasedDateTime <em>Released Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getIssuedBySupervisor <em>Issued By Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getReleasedBySupervisor <em>Released By Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getReleasedToSupervisor <em>Released To Supervisor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SafetyDocumentImpl#getIssuedToSupervisor <em>Issued To Supervisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyDocumentImpl extends DocumentImpl implements SafetyDocument {
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
     * The default value of the '{@link #getReleasedDateTime() <em>Released Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleasedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date RELEASED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReleasedDateTime() <em>Released Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleasedDateTime()
     * @generated
     * @ordered
     */
    protected Date releasedDateTime = RELEASED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Released Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releasedDateTimeESet;

    /**
     * The cached value of the '{@link #getSwitchingPlan() <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlan()
     * @generated
     * @ordered
     */
    protected SwitchingPlan switchingPlan;

    /**
     * This is true if the Switching Plan reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingPlanESet;

    /**
     * The cached value of the '{@link #getIssuedBySupervisor() <em>Issued By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedBySupervisor()
     * @generated
     * @ordered
     */
    protected OperationsSafetySupervisor issuedBySupervisor;

    /**
     * This is true if the Issued By Supervisor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuedBySupervisorESet;

    /**
     * The cached value of the '{@link #getReleasedBySupervisor() <em>Released By Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleasedBySupervisor()
     * @generated
     * @ordered
     */
    protected FieldSafetySupervisor releasedBySupervisor;

    /**
     * This is true if the Released By Supervisor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releasedBySupervisorESet;

    /**
     * The cached value of the '{@link #getReleasedToSupervisor() <em>Released To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReleasedToSupervisor()
     * @generated
     * @ordered
     */
    protected OperationsSafetySupervisor releasedToSupervisor;

    /**
     * This is true if the Released To Supervisor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean releasedToSupervisorESet;

    /**
     * The cached value of the '{@link #getIssuedToSupervisor() <em>Issued To Supervisor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuedToSupervisor()
     * @generated
     * @ordered
     */
    protected FieldSafetySupervisor issuedToSupervisor;

    /**
     * This is true if the Issued To Supervisor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuedToSupervisorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SafetyDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSafetyDocument();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME,
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
    public Date getReleasedDateTime() {
        return releasedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReleasedDateTime( Date newReleasedDateTime ) {
        Date oldReleasedDateTime = releasedDateTime;
        releasedDateTime = newReleasedDateTime;
        boolean oldReleasedDateTimeESet = releasedDateTimeESet;
        releasedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME,
                    oldReleasedDateTime, releasedDateTime, !oldReleasedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReleasedDateTime() {
        Date oldReleasedDateTime = releasedDateTime;
        boolean oldReleasedDateTimeESet = releasedDateTimeESet;
        releasedDateTime = RELEASED_DATE_TIME_EDEFAULT;
        releasedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME,
                    oldReleasedDateTime, RELEASED_DATE_TIME_EDEFAULT, oldReleasedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReleasedDateTime() {
        return releasedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingPlan getSwitchingPlan() {
        return switchingPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingPlan( SwitchingPlan newSwitchingPlan, NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = newSwitchingPlan;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, oldSwitchingPlan, newSwitchingPlan,
                    !oldSwitchingPlanESet );
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
    public void setSwitchingPlan( SwitchingPlan newSwitchingPlan ) {
        if( newSwitchingPlan != switchingPlan ) {
            NotificationChain msgs = null;
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            if( newSwitchingPlan != null ) msgs = ( ( InternalEObject ) newSwitchingPlan ).eInverseAdd( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            msgs = basicSetSwitchingPlan( newSwitchingPlan, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN,
                        newSwitchingPlan, newSwitchingPlan, !oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingPlan( NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = null;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, oldSwitchingPlan, null, oldSwitchingPlanESet );
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
    public void unsetSwitchingPlan() {
        if( switchingPlan != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            msgs = basicUnsetSwitchingPlan( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN, null, null, oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlan() {
        return switchingPlanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationsSafetySupervisor getIssuedBySupervisor() {
        return issuedBySupervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIssuedBySupervisor( OperationsSafetySupervisor newIssuedBySupervisor,
            NotificationChain msgs ) {
        OperationsSafetySupervisor oldIssuedBySupervisor = issuedBySupervisor;
        issuedBySupervisor = newIssuedBySupervisor;
        boolean oldIssuedBySupervisorESet = issuedBySupervisorESet;
        issuedBySupervisorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR, oldIssuedBySupervisor, newIssuedBySupervisor,
                    !oldIssuedBySupervisorESet );
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
    public void setIssuedBySupervisor( OperationsSafetySupervisor newIssuedBySupervisor ) {
        if( newIssuedBySupervisor != issuedBySupervisor ) {
            NotificationChain msgs = null;
            if( issuedBySupervisor != null ) msgs = ( ( InternalEObject ) issuedBySupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, OperationsSafetySupervisor.class,
                    msgs );
            if( newIssuedBySupervisor != null ) msgs = ( ( InternalEObject ) newIssuedBySupervisor ).eInverseAdd( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, OperationsSafetySupervisor.class,
                    msgs );
            msgs = basicSetIssuedBySupervisor( newIssuedBySupervisor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuedBySupervisorESet = issuedBySupervisorESet;
            issuedBySupervisorESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR,
                            newIssuedBySupervisor, newIssuedBySupervisor, !oldIssuedBySupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIssuedBySupervisor( NotificationChain msgs ) {
        OperationsSafetySupervisor oldIssuedBySupervisor = issuedBySupervisor;
        issuedBySupervisor = null;
        boolean oldIssuedBySupervisorESet = issuedBySupervisorESet;
        issuedBySupervisorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR, oldIssuedBySupervisor, null,
                    oldIssuedBySupervisorESet );
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
    public void unsetIssuedBySupervisor() {
        if( issuedBySupervisor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) issuedBySupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, OperationsSafetySupervisor.class,
                    msgs );
            msgs = basicUnsetIssuedBySupervisor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuedBySupervisorESet = issuedBySupervisorESet;
            issuedBySupervisorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR, null, null, oldIssuedBySupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuedBySupervisor() {
        return issuedBySupervisorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FieldSafetySupervisor getReleasedBySupervisor() {
        return releasedBySupervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReleasedBySupervisor( FieldSafetySupervisor newReleasedBySupervisor,
            NotificationChain msgs ) {
        FieldSafetySupervisor oldReleasedBySupervisor = releasedBySupervisor;
        releasedBySupervisor = newReleasedBySupervisor;
        boolean oldReleasedBySupervisorESet = releasedBySupervisorESet;
        releasedBySupervisorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR, oldReleasedBySupervisor,
                    newReleasedBySupervisor, !oldReleasedBySupervisorESet );
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
    public void setReleasedBySupervisor( FieldSafetySupervisor newReleasedBySupervisor ) {
        if( newReleasedBySupervisor != releasedBySupervisor ) {
            NotificationChain msgs = null;
            if( releasedBySupervisor != null ) msgs = ( ( InternalEObject ) releasedBySupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            if( newReleasedBySupervisor != null )
                msgs = ( ( InternalEObject ) newReleasedBySupervisor ).eInverseAdd( this,
                        CimPackage.FIELD_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class,
                        msgs );
            msgs = basicSetReleasedBySupervisor( newReleasedBySupervisor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReleasedBySupervisorESet = releasedBySupervisorESet;
            releasedBySupervisorESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR,
                            newReleasedBySupervisor, newReleasedBySupervisor, !oldReleasedBySupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReleasedBySupervisor( NotificationChain msgs ) {
        FieldSafetySupervisor oldReleasedBySupervisor = releasedBySupervisor;
        releasedBySupervisor = null;
        boolean oldReleasedBySupervisorESet = releasedBySupervisorESet;
        releasedBySupervisorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR, oldReleasedBySupervisor, null,
                    oldReleasedBySupervisorESet );
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
    public void unsetReleasedBySupervisor() {
        if( releasedBySupervisor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) releasedBySupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            msgs = basicUnsetReleasedBySupervisor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReleasedBySupervisorESet = releasedBySupervisorESet;
            releasedBySupervisorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR, null, null, oldReleasedBySupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReleasedBySupervisor() {
        return releasedBySupervisorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationsSafetySupervisor getReleasedToSupervisor() {
        return releasedToSupervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReleasedToSupervisor( OperationsSafetySupervisor newReleasedToSupervisor,
            NotificationChain msgs ) {
        OperationsSafetySupervisor oldReleasedToSupervisor = releasedToSupervisor;
        releasedToSupervisor = newReleasedToSupervisor;
        boolean oldReleasedToSupervisorESet = releasedToSupervisorESet;
        releasedToSupervisorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR, oldReleasedToSupervisor,
                    newReleasedToSupervisor, !oldReleasedToSupervisorESet );
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
    public void setReleasedToSupervisor( OperationsSafetySupervisor newReleasedToSupervisor ) {
        if( newReleasedToSupervisor != releasedToSupervisor ) {
            NotificationChain msgs = null;
            if( releasedToSupervisor != null ) msgs = ( ( InternalEObject ) releasedToSupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS,
                    OperationsSafetySupervisor.class, msgs );
            if( newReleasedToSupervisor != null )
                msgs = ( ( InternalEObject ) newReleasedToSupervisor ).eInverseAdd( this,
                        CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS,
                        OperationsSafetySupervisor.class, msgs );
            msgs = basicSetReleasedToSupervisor( newReleasedToSupervisor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReleasedToSupervisorESet = releasedToSupervisorESet;
            releasedToSupervisorESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR,
                            newReleasedToSupervisor, newReleasedToSupervisor, !oldReleasedToSupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReleasedToSupervisor( NotificationChain msgs ) {
        OperationsSafetySupervisor oldReleasedToSupervisor = releasedToSupervisor;
        releasedToSupervisor = null;
        boolean oldReleasedToSupervisorESet = releasedToSupervisorESet;
        releasedToSupervisorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR, oldReleasedToSupervisor, null,
                    oldReleasedToSupervisorESet );
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
    public void unsetReleasedToSupervisor() {
        if( releasedToSupervisor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) releasedToSupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS,
                    OperationsSafetySupervisor.class, msgs );
            msgs = basicUnsetReleasedToSupervisor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReleasedToSupervisorESet = releasedToSupervisorESet;
            releasedToSupervisorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR, null, null, oldReleasedToSupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReleasedToSupervisor() {
        return releasedToSupervisorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FieldSafetySupervisor getIssuedToSupervisor() {
        return issuedToSupervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIssuedToSupervisor( FieldSafetySupervisor newIssuedToSupervisor,
            NotificationChain msgs ) {
        FieldSafetySupervisor oldIssuedToSupervisor = issuedToSupervisor;
        issuedToSupervisor = newIssuedToSupervisor;
        boolean oldIssuedToSupervisorESet = issuedToSupervisorESet;
        issuedToSupervisorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR, oldIssuedToSupervisor, newIssuedToSupervisor,
                    !oldIssuedToSupervisorESet );
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
    public void setIssuedToSupervisor( FieldSafetySupervisor newIssuedToSupervisor ) {
        if( newIssuedToSupervisor != issuedToSupervisor ) {
            NotificationChain msgs = null;
            if( issuedToSupervisor != null ) msgs = ( ( InternalEObject ) issuedToSupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            if( newIssuedToSupervisor != null ) msgs = ( ( InternalEObject ) newIssuedToSupervisor ).eInverseAdd( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            msgs = basicSetIssuedToSupervisor( newIssuedToSupervisor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuedToSupervisorESet = issuedToSupervisorESet;
            issuedToSupervisorESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR,
                            newIssuedToSupervisor, newIssuedToSupervisor, !oldIssuedToSupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIssuedToSupervisor( NotificationChain msgs ) {
        FieldSafetySupervisor oldIssuedToSupervisor = issuedToSupervisor;
        issuedToSupervisor = null;
        boolean oldIssuedToSupervisorESet = issuedToSupervisorESet;
        issuedToSupervisorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR, oldIssuedToSupervisor, null,
                    oldIssuedToSupervisorESet );
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
    public void unsetIssuedToSupervisor() {
        if( issuedToSupervisor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) issuedToSupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            msgs = basicUnsetIssuedToSupervisor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuedToSupervisorESet = issuedToSupervisorESet;
            issuedToSupervisorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR, null, null, oldIssuedToSupervisorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuedToSupervisor() {
        return issuedToSupervisorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, SwitchingPlan.class, msgs );
            return basicSetSwitchingPlan( ( SwitchingPlan ) otherEnd, msgs );
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            if( issuedBySupervisor != null ) msgs = ( ( InternalEObject ) issuedBySupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, OperationsSafetySupervisor.class,
                    msgs );
            return basicSetIssuedBySupervisor( ( OperationsSafetySupervisor ) otherEnd, msgs );
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            if( releasedBySupervisor != null ) msgs = ( ( InternalEObject ) releasedBySupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            return basicSetReleasedBySupervisor( ( FieldSafetySupervisor ) otherEnd, msgs );
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            if( releasedToSupervisor != null ) msgs = ( ( InternalEObject ) releasedToSupervisor ).eInverseRemove( this,
                    CimPackage.OPERATIONS_SAFETY_SUPERVISOR__RELEASED_SAFETY_DOCUMENTS,
                    OperationsSafetySupervisor.class, msgs );
            return basicSetReleasedToSupervisor( ( OperationsSafetySupervisor ) otherEnd, msgs );
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            if( issuedToSupervisor != null ) msgs = ( ( InternalEObject ) issuedToSupervisor ).eInverseRemove( this,
                    CimPackage.FIELD_SAFETY_SUPERVISOR__ISSUED_SAFETY_DOCUMENTS, FieldSafetySupervisor.class, msgs );
            return basicSetIssuedToSupervisor( ( FieldSafetySupervisor ) otherEnd, msgs );
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
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return basicUnsetSwitchingPlan( msgs );
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            return basicUnsetIssuedBySupervisor( msgs );
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            return basicUnsetReleasedBySupervisor( msgs );
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            return basicUnsetReleasedToSupervisor( msgs );
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            return basicUnsetIssuedToSupervisor( msgs );
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
        case CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME:
            return getIssuedDateTime();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME:
            return getReleasedDateTime();
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return getSwitchingPlan();
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            return getIssuedBySupervisor();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            return getReleasedBySupervisor();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            return getReleasedToSupervisor();
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            return getIssuedToSupervisor();
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
        case CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME:
            setIssuedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME:
            setReleasedDateTime( ( Date ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            setSwitchingPlan( ( SwitchingPlan ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            setIssuedBySupervisor( ( OperationsSafetySupervisor ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            setReleasedBySupervisor( ( FieldSafetySupervisor ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            setReleasedToSupervisor( ( OperationsSafetySupervisor ) newValue );
            return;
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            setIssuedToSupervisor( ( FieldSafetySupervisor ) newValue );
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
        case CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME:
            unsetIssuedDateTime();
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME:
            unsetReleasedDateTime();
            return;
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            unsetSwitchingPlan();
            return;
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            unsetIssuedBySupervisor();
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            unsetReleasedBySupervisor();
            return;
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            unsetReleasedToSupervisor();
            return;
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            unsetIssuedToSupervisor();
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
        case CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME:
            return isSetIssuedDateTime();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME:
            return isSetReleasedDateTime();
        case CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN:
            return isSetSwitchingPlan();
        case CimPackage.SAFETY_DOCUMENT__ISSUED_BY_SUPERVISOR:
            return isSetIssuedBySupervisor();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_BY_SUPERVISOR:
            return isSetReleasedBySupervisor();
        case CimPackage.SAFETY_DOCUMENT__RELEASED_TO_SUPERVISOR:
            return isSetReleasedToSupervisor();
        case CimPackage.SAFETY_DOCUMENT__ISSUED_TO_SUPERVISOR:
            return isSetIssuedToSupervisor();
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
        result.append( " (issuedDateTime: " );
        if( issuedDateTimeESet )
            result.append( issuedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", releasedDateTime: " );
        if( releasedDateTimeESet )
            result.append( releasedDateTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SafetyDocumentImpl
