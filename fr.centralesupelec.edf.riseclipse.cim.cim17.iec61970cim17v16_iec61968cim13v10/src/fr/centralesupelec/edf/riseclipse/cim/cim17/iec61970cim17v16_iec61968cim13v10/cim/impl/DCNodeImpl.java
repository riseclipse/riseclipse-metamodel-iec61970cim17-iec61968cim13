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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalNode;

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
 * An implementation of the model object '<em><b>DC Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCNodeImpl#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCNodeImpl#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCNodeImpl#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCNodeImpl extends IdentifiedObjectImpl implements DCNode {
    /**
     * The cached value of the '{@link #getDCTerminals() <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTerminals()
     * @generated
     * @ordered
     */
    protected EList< DCBaseTerminal > dcTerminals;

    /**
     * The cached value of the '{@link #getDCTopologicalNode() <em>DC Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTopologicalNode()
     * @generated
     * @ordered
     */
    protected DCTopologicalNode dcTopologicalNode;

    /**
     * This is true if the DC Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcTopologicalNodeESet;

    /**
     * The cached value of the '{@link #getDCEquipmentContainer() <em>DC Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCEquipmentContainer()
     * @generated
     * @ordered
     */
    protected DCEquipmentContainer dcEquipmentContainer;

    /**
     * This is true if the DC Equipment Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcEquipmentContainerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCBaseTerminal > getDCTerminals() {
        if( dcTerminals == null ) {
            dcTerminals = new EObjectWithInverseResolvingEList.Unsettable< DCBaseTerminal >( DCBaseTerminal.class, this,
                    CimPackage.DC_NODE__DC_TERMINALS, CimPackage.DC_BASE_TERMINAL__DC_NODE );
        }
        return dcTerminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCTerminals() {
        if( dcTerminals != null ) ( ( InternalEList.Unsettable< ? > ) dcTerminals ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTerminals() {
        return dcTerminals != null && ( ( InternalEList.Unsettable< ? > ) dcTerminals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCTopologicalNode getDCTopologicalNode() {
        return dcTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCTopologicalNode( DCTopologicalNode newDCTopologicalNode,
            NotificationChain msgs ) {
        DCTopologicalNode oldDCTopologicalNode = dcTopologicalNode;
        dcTopologicalNode = newDCTopologicalNode;
        boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
        dcTopologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE, oldDCTopologicalNode, newDCTopologicalNode,
                    !oldDCTopologicalNodeESet );
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
    public void setDCTopologicalNode( DCTopologicalNode newDCTopologicalNode ) {
        if( newDCTopologicalNode != dcTopologicalNode ) {
            NotificationChain msgs = null;
            if( dcTopologicalNode != null ) msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES, DCTopologicalNode.class, msgs );
            if( newDCTopologicalNode != null ) msgs = ( ( InternalEObject ) newDCTopologicalNode ).eInverseAdd( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES, DCTopologicalNode.class, msgs );
            msgs = basicSetDCTopologicalNode( newDCTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
            dcTopologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE,
                        newDCTopologicalNode, newDCTopologicalNode, !oldDCTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCTopologicalNode( NotificationChain msgs ) {
        DCTopologicalNode oldDCTopologicalNode = dcTopologicalNode;
        dcTopologicalNode = null;
        boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
        dcTopologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE, oldDCTopologicalNode, null, oldDCTopologicalNodeESet );
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
    public void unsetDCTopologicalNode() {
        if( dcTopologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES, DCTopologicalNode.class, msgs );
            msgs = basicUnsetDCTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalNodeESet = dcTopologicalNodeESet;
            dcTopologicalNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE, null, null, oldDCTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTopologicalNode() {
        return dcTopologicalNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCEquipmentContainer getDCEquipmentContainer() {
        return dcEquipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCEquipmentContainer( DCEquipmentContainer newDCEquipmentContainer,
            NotificationChain msgs ) {
        DCEquipmentContainer oldDCEquipmentContainer = dcEquipmentContainer;
        dcEquipmentContainer = newDCEquipmentContainer;
        boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
        dcEquipmentContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER, oldDCEquipmentContainer, newDCEquipmentContainer,
                    !oldDCEquipmentContainerESet );
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
    public void setDCEquipmentContainer( DCEquipmentContainer newDCEquipmentContainer ) {
        if( newDCEquipmentContainer != dcEquipmentContainer ) {
            NotificationChain msgs = null;
            if( dcEquipmentContainer != null ) msgs = ( ( InternalEObject ) dcEquipmentContainer ).eInverseRemove( this,
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES, DCEquipmentContainer.class, msgs );
            if( newDCEquipmentContainer != null ) msgs = ( ( InternalEObject ) newDCEquipmentContainer )
                    .eInverseAdd( this, CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES, DCEquipmentContainer.class, msgs );
            msgs = basicSetDCEquipmentContainer( newDCEquipmentContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
            dcEquipmentContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER,
                        newDCEquipmentContainer, newDCEquipmentContainer, !oldDCEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCEquipmentContainer( NotificationChain msgs ) {
        DCEquipmentContainer oldDCEquipmentContainer = dcEquipmentContainer;
        dcEquipmentContainer = null;
        boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
        dcEquipmentContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER, oldDCEquipmentContainer, null,
                    oldDCEquipmentContainerESet );
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
    public void unsetDCEquipmentContainer() {
        if( dcEquipmentContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcEquipmentContainer ).eInverseRemove( this,
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES, DCEquipmentContainer.class, msgs );
            msgs = basicUnsetDCEquipmentContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
            dcEquipmentContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER, null, null, oldDCEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCEquipmentContainer() {
        return dcEquipmentContainerESet;
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            if( dcTopologicalNode != null ) msgs = ( ( InternalEObject ) dcTopologicalNode ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES, DCTopologicalNode.class, msgs );
            return basicSetDCTopologicalNode( ( DCTopologicalNode ) otherEnd, msgs );
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            if( dcEquipmentContainer != null ) msgs = ( ( InternalEObject ) dcEquipmentContainer ).eInverseRemove( this,
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES, DCEquipmentContainer.class, msgs );
            return basicSetDCEquipmentContainer( ( DCEquipmentContainer ) otherEnd, msgs );
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            return ( ( InternalEList< ? > ) getDCTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            return basicUnsetDCTopologicalNode( msgs );
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            return basicUnsetDCEquipmentContainer( msgs );
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            return getDCTerminals();
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            return getDCTopologicalNode();
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            return getDCEquipmentContainer();
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            getDCTerminals().clear();
            getDCTerminals().addAll( ( Collection< ? extends DCBaseTerminal > ) newValue );
            return;
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            setDCTopologicalNode( ( DCTopologicalNode ) newValue );
            return;
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            setDCEquipmentContainer( ( DCEquipmentContainer ) newValue );
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            unsetDCTerminals();
            return;
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            unsetDCTopologicalNode();
            return;
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            unsetDCEquipmentContainer();
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
        case CimPackage.DC_NODE__DC_TERMINALS:
            return isSetDCTerminals();
        case CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE:
            return isSetDCTopologicalNode();
        case CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER:
            return isSetDCEquipmentContainer();
        }
        return super.eIsSet( featureID );
    }

} //DCNodeImpl
