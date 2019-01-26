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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

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
 * An implementation of the model object '<em><b>Switching Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getOutage <em>Outage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getSwitchingStepGroups <em>Switching Step Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingPlanImpl#getSafetyDocuments <em>Safety Documents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingPlanImpl extends SwitchingStepGroupImpl implements SwitchingPlan {
    /**
     * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected static final String PURPOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPurpose()
     * @generated
     * @ordered
     */
    protected String purpose = PURPOSE_EDEFAULT;

    /**
     * This is true if the Purpose attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean purposeESet;

    /**
     * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRank()
     * @generated
     * @ordered
     */
    protected static final Integer RANK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRank()
     * @generated
     * @ordered
     */
    protected Integer rank = RANK_EDEFAULT;

    /**
     * This is true if the Rank attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rankESet;

    /**
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected Outage outage;

    /**
     * This is true if the Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageESet;

    /**
     * The cached value of the '{@link #getSwitchingStepGroups() <em>Switching Step Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingStepGroups()
     * @generated
     * @ordered
     */
    protected EList< SwitchingStepGroup > switchingStepGroups;

    /**
     * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > workTasks;

    /**
     * The cached value of the '{@link #getSafetyDocuments() <em>Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSafetyDocuments()
     * @generated
     * @ordered
     */
    protected EList< SafetyDocument > safetyDocuments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchingPlanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchingPlan();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPurpose() {
        return purpose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPurpose( String newPurpose ) {
        String oldPurpose = purpose;
        purpose = newPurpose;
        boolean oldPurposeESet = purposeESet;
        purposeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCHING_PLAN__PURPOSE, oldPurpose, purpose, !oldPurposeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPurpose() {
        String oldPurpose = purpose;
        boolean oldPurposeESet = purposeESet;
        purpose = PURPOSE_EDEFAULT;
        purposeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCHING_PLAN__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPurpose() {
        return purposeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRank() {
        return rank;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRank( Integer newRank ) {
        Integer oldRank = rank;
        rank = newRank;
        boolean oldRankESet = rankESet;
        rankESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCHING_PLAN__RANK, oldRank, rank, !oldRankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRank() {
        Integer oldRank = rank;
        boolean oldRankESet = rankESet;
        rank = RANK_EDEFAULT;
        rankESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCHING_PLAN__RANK, oldRank, RANK_EDEFAULT, oldRankESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRank() {
        return rankESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage getOutage() {
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutage( Outage newOutage, NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = newOutage;
        boolean oldOutageESet = outageESet;
        outageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_PLAN__OUTAGE, oldOutage, newOutage, !oldOutageESet );
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
    public void setOutage( Outage newOutage ) {
        if( newOutage != outage ) {
            NotificationChain msgs = null;
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__SWITCHING_PLANS, Outage.class, msgs );
            if( newOutage != null ) msgs = ( ( InternalEObject ) newOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__SWITCHING_PLANS, Outage.class, msgs );
            msgs = basicSetOutage( newOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_PLAN__OUTAGE, newOutage, newOutage, !oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutage( NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = null;
        boolean oldOutageESet = outageESet;
        outageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_PLAN__OUTAGE, oldOutage, null, oldOutageESet );
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
    public void unsetOutage() {
        if( outage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__SWITCHING_PLANS,
                    Outage.class, msgs );
            msgs = basicUnsetOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_PLAN__OUTAGE, null, null, oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchingStepGroup > getSwitchingStepGroups() {
        if( switchingStepGroups == null ) {
            switchingStepGroups = new EObjectWithInverseResolvingEList.Unsettable< SwitchingStepGroup >(
                    SwitchingStepGroup.class, this, CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN );
        }
        return switchingStepGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingStepGroups() {
        if( switchingStepGroups != null ) ( ( InternalEList.Unsettable< ? > ) switchingStepGroups ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingStepGroups() {
        return switchingStepGroups != null && ( ( InternalEList.Unsettable< ? > ) switchingStepGroups ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkTask > getWorkTasks() {
        if( workTasks == null ) {
            workTasks = new EObjectWithInverseResolvingEList.Unsettable< WorkTask >( WorkTask.class, this,
                    CimPackage.SWITCHING_PLAN__WORK_TASKS, CimPackage.WORK_TASK__SWITCHING_PLAN );
        }
        return workTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTasks() {
        if( workTasks != null ) ( ( InternalEList.Unsettable< ? > ) workTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTasks() {
        return workTasks != null && ( ( InternalEList.Unsettable< ? > ) workTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SafetyDocument > getSafetyDocuments() {
        if( safetyDocuments == null ) {
            safetyDocuments = new EObjectWithInverseResolvingEList.Unsettable< SafetyDocument >( SafetyDocument.class,
                    this, CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS, CimPackage.SAFETY_DOCUMENT__SWITCHING_PLAN );
        }
        return safetyDocuments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSafetyDocuments() {
        if( safetyDocuments != null ) ( ( InternalEList.Unsettable< ? > ) safetyDocuments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSafetyDocuments() {
        return safetyDocuments != null && ( ( InternalEList.Unsettable< ? > ) safetyDocuments ).isSet();
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
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__SWITCHING_PLANS, Outage.class, msgs );
            return basicSetOutage( ( Outage ) otherEnd, msgs );
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchingStepGroups() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkTasks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSafetyDocuments() )
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
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            return basicUnsetOutage( msgs );
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            return ( ( InternalEList< ? > ) getSwitchingStepGroups() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            return ( ( InternalEList< ? > ) getWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            return ( ( InternalEList< ? > ) getSafetyDocuments() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SWITCHING_PLAN__PURPOSE:
            return getPurpose();
        case CimPackage.SWITCHING_PLAN__RANK:
            return getRank();
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            return getOutage();
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            return getSwitchingStepGroups();
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            return getWorkTasks();
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            return getSafetyDocuments();
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
        case CimPackage.SWITCHING_PLAN__PURPOSE:
            setPurpose( ( String ) newValue );
            return;
        case CimPackage.SWITCHING_PLAN__RANK:
            setRank( ( Integer ) newValue );
            return;
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            setOutage( ( Outage ) newValue );
            return;
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            getSwitchingStepGroups().clear();
            getSwitchingStepGroups().addAll( ( Collection< ? extends SwitchingStepGroup > ) newValue );
            return;
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            getWorkTasks().clear();
            getWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            getSafetyDocuments().clear();
            getSafetyDocuments().addAll( ( Collection< ? extends SafetyDocument > ) newValue );
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
        case CimPackage.SWITCHING_PLAN__PURPOSE:
            unsetPurpose();
            return;
        case CimPackage.SWITCHING_PLAN__RANK:
            unsetRank();
            return;
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            unsetOutage();
            return;
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            unsetSwitchingStepGroups();
            return;
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            unsetWorkTasks();
            return;
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            unsetSafetyDocuments();
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
        case CimPackage.SWITCHING_PLAN__PURPOSE:
            return isSetPurpose();
        case CimPackage.SWITCHING_PLAN__RANK:
            return isSetRank();
        case CimPackage.SWITCHING_PLAN__OUTAGE:
            return isSetOutage();
        case CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS:
            return isSetSwitchingStepGroups();
        case CimPackage.SWITCHING_PLAN__WORK_TASKS:
            return isSetWorkTasks();
        case CimPackage.SWITCHING_PLAN__SAFETY_DOCUMENTS:
            return isSetSafetyDocuments();
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
        result.append( " (purpose: " );
        if( purposeESet )
            result.append( purpose );
        else
            result.append( "<unset>" );
        result.append( ", rank: " );
        if( rankESet )
            result.append( rank );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchingPlanImpl
