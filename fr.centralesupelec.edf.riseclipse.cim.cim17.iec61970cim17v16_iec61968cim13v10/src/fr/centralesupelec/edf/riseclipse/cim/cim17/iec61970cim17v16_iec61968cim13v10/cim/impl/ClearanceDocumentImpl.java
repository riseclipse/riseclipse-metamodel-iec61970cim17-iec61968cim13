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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;

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
 * An implementation of the model object '<em><b>Clearance Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceDocumentImpl#getMustBeDeenergised <em>Must Be Deenergised</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceDocumentImpl#getMustBeGrounded <em>Must Be Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceDocumentImpl#getClearanceAction <em>Clearance Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ClearanceDocumentImpl#getTaggedPSRs <em>Tagged PS Rs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceDocumentImpl extends SafetyDocumentImpl implements ClearanceDocument {
    /**
     * The default value of the '{@link #getMustBeDeenergised() <em>Must Be Deenergised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustBeDeenergised()
     * @generated
     * @ordered
     */
    protected static final Boolean MUST_BE_DEENERGISED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMustBeDeenergised() <em>Must Be Deenergised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustBeDeenergised()
     * @generated
     * @ordered
     */
    protected Boolean mustBeDeenergised = MUST_BE_DEENERGISED_EDEFAULT;

    /**
     * This is true if the Must Be Deenergised attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mustBeDeenergisedESet;

    /**
     * The default value of the '{@link #getMustBeGrounded() <em>Must Be Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustBeGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean MUST_BE_GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMustBeGrounded() <em>Must Be Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMustBeGrounded()
     * @generated
     * @ordered
     */
    protected Boolean mustBeGrounded = MUST_BE_GROUNDED_EDEFAULT;

    /**
     * This is true if the Must Be Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mustBeGroundedESet;

    /**
     * The cached value of the '{@link #getClearanceAction() <em>Clearance Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClearanceAction()
     * @generated
     * @ordered
     */
    protected ClearanceAction clearanceAction;

    /**
     * This is true if the Clearance Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean clearanceActionESet;

    /**
     * The cached value of the '{@link #getTaggedPSRs() <em>Tagged PS Rs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaggedPSRs()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemResource > taggedPSRs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClearanceDocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getClearanceDocument();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMustBeDeenergised() {
        return mustBeDeenergised;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMustBeDeenergised( Boolean newMustBeDeenergised ) {
        Boolean oldMustBeDeenergised = mustBeDeenergised;
        mustBeDeenergised = newMustBeDeenergised;
        boolean oldMustBeDeenergisedESet = mustBeDeenergisedESet;
        mustBeDeenergisedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED,
                    oldMustBeDeenergised, mustBeDeenergised, !oldMustBeDeenergisedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMustBeDeenergised() {
        Boolean oldMustBeDeenergised = mustBeDeenergised;
        boolean oldMustBeDeenergisedESet = mustBeDeenergisedESet;
        mustBeDeenergised = MUST_BE_DEENERGISED_EDEFAULT;
        mustBeDeenergisedESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED,
                        oldMustBeDeenergised, MUST_BE_DEENERGISED_EDEFAULT, oldMustBeDeenergisedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMustBeDeenergised() {
        return mustBeDeenergisedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMustBeGrounded() {
        return mustBeGrounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMustBeGrounded( Boolean newMustBeGrounded ) {
        Boolean oldMustBeGrounded = mustBeGrounded;
        mustBeGrounded = newMustBeGrounded;
        boolean oldMustBeGroundedESet = mustBeGroundedESet;
        mustBeGroundedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED,
                    oldMustBeGrounded, mustBeGrounded, !oldMustBeGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMustBeGrounded() {
        Boolean oldMustBeGrounded = mustBeGrounded;
        boolean oldMustBeGroundedESet = mustBeGroundedESet;
        mustBeGrounded = MUST_BE_GROUNDED_EDEFAULT;
        mustBeGroundedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED,
                    oldMustBeGrounded, MUST_BE_GROUNDED_EDEFAULT, oldMustBeGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMustBeGrounded() {
        return mustBeGroundedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClearanceAction getClearanceAction() {
        if( clearanceAction != null && clearanceAction.eIsProxy() ) {
            InternalEObject oldClearanceAction = ( InternalEObject ) clearanceAction;
            clearanceAction = ( ClearanceAction ) eResolveProxy( oldClearanceAction );
            if( clearanceAction != oldClearanceAction ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, oldClearanceAction, clearanceAction ) );
            }
        }
        return clearanceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClearanceAction basicGetClearanceAction() {
        return clearanceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClearanceAction( ClearanceAction newClearanceAction, NotificationChain msgs ) {
        ClearanceAction oldClearanceAction = clearanceAction;
        clearanceAction = newClearanceAction;
        boolean oldClearanceActionESet = clearanceActionESet;
        clearanceActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, oldClearanceAction, newClearanceAction,
                    !oldClearanceActionESet );
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
    public void setClearanceAction( ClearanceAction newClearanceAction ) {
        if( newClearanceAction != clearanceAction ) {
            NotificationChain msgs = null;
            if( clearanceAction != null ) msgs = ( ( InternalEObject ) clearanceAction ).eInverseRemove( this,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, ClearanceAction.class, msgs );
            if( newClearanceAction != null ) msgs = ( ( InternalEObject ) newClearanceAction ).eInverseAdd( this,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, ClearanceAction.class, msgs );
            msgs = basicSetClearanceAction( newClearanceAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldClearanceActionESet = clearanceActionESet;
            clearanceActionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION,
                        newClearanceAction, newClearanceAction, !oldClearanceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetClearanceAction( NotificationChain msgs ) {
        ClearanceAction oldClearanceAction = clearanceAction;
        clearanceAction = null;
        boolean oldClearanceActionESet = clearanceActionESet;
        clearanceActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, oldClearanceAction, null, oldClearanceActionESet );
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
    public void unsetClearanceAction() {
        if( clearanceAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) clearanceAction ).eInverseRemove( this, CimPackage.CLEARANCE_ACTION__CLEARANCE,
                    ClearanceAction.class, msgs );
            msgs = basicUnsetClearanceAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldClearanceActionESet = clearanceActionESet;
            clearanceActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION, null, null, oldClearanceActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClearanceAction() {
        return clearanceActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemResource > getTaggedPSRs() {
        if( taggedPSRs == null ) {
            taggedPSRs = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< PowerSystemResource >(
                    PowerSystemResource.class, this, CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS,
                    CimPackage.POWER_SYSTEM_RESOURCE__CLEARANCES );
        }
        return taggedPSRs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTaggedPSRs() {
        if( taggedPSRs != null ) ( ( InternalEList.Unsettable< ? > ) taggedPSRs ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTaggedPSRs() {
        return taggedPSRs != null && ( ( InternalEList.Unsettable< ? > ) taggedPSRs ).isSet();
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
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            if( clearanceAction != null ) msgs = ( ( InternalEObject ) clearanceAction ).eInverseRemove( this,
                    CimPackage.CLEARANCE_ACTION__CLEARANCE, ClearanceAction.class, msgs );
            return basicSetClearanceAction( ( ClearanceAction ) otherEnd, msgs );
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTaggedPSRs() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            return basicUnsetClearanceAction( msgs );
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            return ( ( InternalEList< ? > ) getTaggedPSRs() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED:
            return getMustBeDeenergised();
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED:
            return getMustBeGrounded();
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            if( resolve ) return getClearanceAction();
            return basicGetClearanceAction();
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            return getTaggedPSRs();
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
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED:
            setMustBeDeenergised( ( Boolean ) newValue );
            return;
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED:
            setMustBeGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            setClearanceAction( ( ClearanceAction ) newValue );
            return;
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            getTaggedPSRs().clear();
            getTaggedPSRs().addAll( ( Collection< ? extends PowerSystemResource > ) newValue );
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
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED:
            unsetMustBeDeenergised();
            return;
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED:
            unsetMustBeGrounded();
            return;
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            unsetClearanceAction();
            return;
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            unsetTaggedPSRs();
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
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_DEENERGISED:
            return isSetMustBeDeenergised();
        case CimPackage.CLEARANCE_DOCUMENT__MUST_BE_GROUNDED:
            return isSetMustBeGrounded();
        case CimPackage.CLEARANCE_DOCUMENT__CLEARANCE_ACTION:
            return isSetClearanceAction();
        case CimPackage.CLEARANCE_DOCUMENT__TAGGED_PS_RS:
            return isSetTaggedPSRs();
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
        result.append( " (mustBeDeenergised: " );
        if( mustBeDeenergisedESet )
            result.append( mustBeDeenergised );
        else
            result.append( "<unset>" );
        result.append( ", mustBeGrounded: " );
        if( mustBeGroundedESet )
            result.append( mustBeGrounded );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ClearanceDocumentImpl
