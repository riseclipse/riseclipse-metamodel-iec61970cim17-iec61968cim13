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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Group Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupTerminalImpl#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupTerminalImpl#getBranchGroup <em>Branch Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BranchGroupTerminalImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchGroupTerminalImpl extends CimObjectWithIDImpl implements BranchGroupTerminal {
    /**
     * The default value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected static final Boolean POSITIVE_FLOW_IN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected Boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

    /**
     * This is true if the Positive Flow In attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveFlowInESet;

    /**
     * The cached value of the '{@link #getBranchGroup() <em>Branch Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchGroup()
     * @generated
     * @ordered
     */
    protected BranchGroup branchGroup;

    /**
     * This is true if the Branch Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean branchGroupESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BranchGroupTerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBranchGroupTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPositiveFlowIn() {
        return positiveFlowIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveFlowIn( Boolean newPositiveFlowIn ) {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        positiveFlowIn = newPositiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowInESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN,
                    oldPositiveFlowIn, positiveFlowIn, !oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveFlowIn() {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;
        positiveFlowInESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN,
                        oldPositiveFlowIn, POSITIVE_FLOW_IN_EDEFAULT, oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveFlowIn() {
        return positiveFlowInESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BranchGroup getBranchGroup() {
        return branchGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBranchGroup( BranchGroup newBranchGroup, NotificationChain msgs ) {
        BranchGroup oldBranchGroup = branchGroup;
        branchGroup = newBranchGroup;
        boolean oldBranchGroupESet = branchGroupESet;
        branchGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, oldBranchGroup, newBranchGroup,
                    !oldBranchGroupESet );
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
    public void setBranchGroup( BranchGroup newBranchGroup ) {
        if( newBranchGroup != branchGroup ) {
            NotificationChain msgs = null;
            if( branchGroup != null ) msgs = ( ( InternalEObject ) branchGroup ).eInverseRemove( this,
                    CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs );
            if( newBranchGroup != null ) msgs = ( ( InternalEObject ) newBranchGroup ).eInverseAdd( this,
                    CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs );
            msgs = basicSetBranchGroup( newBranchGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBranchGroupESet = branchGroupESet;
            branchGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP,
                        newBranchGroup, newBranchGroup, !oldBranchGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBranchGroup( NotificationChain msgs ) {
        BranchGroup oldBranchGroup = branchGroup;
        branchGroup = null;
        boolean oldBranchGroupESet = branchGroupESet;
        branchGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, oldBranchGroup, null, oldBranchGroupESet );
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
    public void unsetBranchGroup() {
        if( branchGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) branchGroup ).eInverseRemove( this,
                    CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs );
            msgs = basicUnsetBranchGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBranchGroupESet = branchGroupESet;
            branchGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP, null, null, oldBranchGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBranchGroup() {
        return branchGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs );
            if( newTerminal != null ) msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL, newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL, null, null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            if( branchGroup != null ) msgs = ( ( InternalEObject ) branchGroup ).eInverseRemove( this,
                    CimPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs );
            return basicSetBranchGroup( ( BranchGroup ) otherEnd, msgs );
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
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
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            return basicUnsetBranchGroup( msgs );
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            return basicUnsetTerminal( msgs );
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
        case CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
            return getPositiveFlowIn();
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            return getBranchGroup();
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            return getTerminal();
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
        case CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
            setPositiveFlowIn( ( Boolean ) newValue );
            return;
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            setBranchGroup( ( BranchGroup ) newValue );
            return;
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            setTerminal( ( Terminal ) newValue );
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
        case CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
            unsetPositiveFlowIn();
            return;
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            unsetBranchGroup();
            return;
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            unsetTerminal();
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
        case CimPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
            return isSetPositiveFlowIn();
        case CimPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
            return isSetBranchGroup();
        case CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
            return isSetTerminal();
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
        result.append( " (positiveFlowIn: " );
        if( positiveFlowInESet )
            result.append( positiveFlowIn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BranchGroupTerminalImpl
