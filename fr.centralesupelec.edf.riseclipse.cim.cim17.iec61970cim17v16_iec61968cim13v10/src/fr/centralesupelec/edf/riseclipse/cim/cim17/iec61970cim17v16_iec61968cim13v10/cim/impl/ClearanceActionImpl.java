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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceActionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clearance Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceActionImpl#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceActionImpl#getClearance <em>Clearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceActionImpl extends SwitchingStepImpl implements ClearanceAction {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final ClearanceActionKind KIND_EDEFAULT = ClearanceActionKind.ISSUE;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected ClearanceActionKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getSwitchingStepGroup() <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingStepGroup()
     * @generated
     * @ordered
     */
    protected SwitchingStepGroup switchingStepGroup;

    /**
     * This is true if the Switching Step Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingStepGroupESet;

    /**
     * The cached value of the '{@link #getClearance() <em>Clearance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClearance()
     * @generated
     * @ordered
     */
    protected ClearanceDocument clearance;

    /**
     * This is true if the Clearance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean clearanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClearanceActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getClearanceAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClearanceActionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( ClearanceActionKind newKind ) {
        ClearanceActionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CLEARANCE_ACTION__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        ClearanceActionKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CLEARANCE_ACTION__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingStepGroup getSwitchingStepGroup() {
        return switchingStepGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup,
            NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = newSwitchingStepGroup;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, newSwitchingStepGroup,
                    !oldSwitchingStepGroupESet );
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
    public void setSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup ) {
        if( newSwitchingStepGroup != switchingStepGroup ) {
            NotificationChain msgs = null;
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS, SwitchingStepGroup.class, msgs );
            if( newSwitchingStepGroup != null ) msgs = ( ( InternalEObject ) newSwitchingStepGroup ).eInverseAdd( this,
                    CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicSetSwitchingStepGroup( newSwitchingStepGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP,
                            newSwitchingStepGroup, newSwitchingStepGroup, !oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingStepGroup( NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = null;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, null,
                    oldSwitchingStepGroupESet );
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
    public void unsetSwitchingStepGroup() {
        if( switchingStepGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicUnsetSwitchingStepGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP, null, null, oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingStepGroup() {
        return switchingStepGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClearanceDocument getClearance() {
        return clearance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClearance( ClearanceDocument newClearance, NotificationChain msgs ) {
        ClearanceDocument oldClearance = clearance;
        clearance = newClearance;
        boolean oldClearanceESet = clearanceESet;
        clearanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, oldClearance, newClearance, !oldClearanceESet );
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
    public void setClearance( ClearanceDocument newClearance ) {
        if( newClearance != clearance ) {
            NotificationChain msgs = null;
            if( clearance != null ) msgs = ( ( InternalEObject ) clearance ).eInverseRemove( this,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, ClearanceDocument.class, msgs );
            if( newClearance != null ) msgs = ( ( InternalEObject ) newClearance ).eInverseAdd( this,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, ClearanceDocument.class, msgs );
            msgs = basicSetClearance( newClearance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldClearanceESet = clearanceESet;
            clearanceESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, newClearance, newClearance, !oldClearanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetClearance( NotificationChain msgs ) {
        ClearanceDocument oldClearance = clearance;
        clearance = null;
        boolean oldClearanceESet = clearanceESet;
        clearanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, oldClearance, null, oldClearanceESet );
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
    public void unsetClearance() {
        if( clearance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) clearance ).eInverseRemove( this,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, ClearanceDocument.class, msgs );
            msgs = basicUnsetClearance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldClearanceESet = clearanceESet;
            clearanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, null, null, oldClearanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClearance() {
        return clearanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS, SwitchingStepGroup.class, msgs );
            return basicSetSwitchingStepGroup( ( SwitchingStepGroup ) otherEnd, msgs );
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            if( clearance != null ) msgs = ( ( InternalEObject ) clearance ).eInverseRemove( this,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, ClearanceDocument.class, msgs );
            return basicSetClearance( ( ClearanceDocument ) otherEnd, msgs );
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
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            return basicUnsetSwitchingStepGroup( msgs );
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            return basicUnsetClearance( msgs );
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
        case CimPackage.CLEARANCE_ACTION__KIND:
            return getKind();
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            return getSwitchingStepGroup();
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            return getClearance();
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
        case CimPackage.CLEARANCE_ACTION__KIND:
            setKind( ( ClearanceActionKind ) newValue );
            return;
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            setSwitchingStepGroup( ( SwitchingStepGroup ) newValue );
            return;
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            setClearance( ( ClearanceDocument ) newValue );
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
        case CimPackage.CLEARANCE_ACTION__KIND:
            unsetKind();
            return;
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            unsetSwitchingStepGroup();
            return;
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            unsetClearance();
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
        case CimPackage.CLEARANCE_ACTION__KIND:
            return isSetKind();
        case CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP:
            return isSetSwitchingStepGroup();
        case CimPackage.CLEARANCE_ACTION__CLEARANCE:
            return isSetClearance();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ClearanceActionImpl
