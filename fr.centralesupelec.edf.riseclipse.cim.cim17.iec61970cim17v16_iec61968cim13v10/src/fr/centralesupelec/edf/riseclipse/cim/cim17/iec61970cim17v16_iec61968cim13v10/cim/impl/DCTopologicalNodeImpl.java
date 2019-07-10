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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCBaseTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCTopologicalIsland;
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
 * An implementation of the model object '<em><b>DC Topological Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCTopologicalNodeImpl#getDCNodes <em>DC Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCTopologicalNodeImpl#getDCTerminals <em>DC Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCTopologicalNodeImpl#getDCTopologicalIsland <em>DC Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DCTopologicalNodeImpl#getDCEquipmentContainer <em>DC Equipment Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCTopologicalNodeImpl extends IdentifiedObjectImpl implements DCTopologicalNode {
    /**
     * The cached value of the '{@link #getDCNodes() <em>DC Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCNodes()
     * @generated
     * @ordered
     */
    protected EList< DCNode > dcNodes;

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
     * The cached value of the '{@link #getDCTopologicalIsland() <em>DC Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTopologicalIsland()
     * @generated
     * @ordered
     */
    protected DCTopologicalIsland dcTopologicalIsland;

    /**
     * This is true if the DC Topological Island reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dcTopologicalIslandESet;

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
    protected DCTopologicalNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCTopologicalNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCNode > getDCNodes() {
        if( dcNodes == null ) {
            dcNodes = new EObjectWithInverseResolvingEList.Unsettable< DCNode >( DCNode.class, this,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES, CimPackage.DC_NODE__DC_TOPOLOGICAL_NODE );
        }
        return dcNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCNodes() {
        if( dcNodes != null ) ( ( InternalEList.Unsettable< ? > ) dcNodes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCNodes() {
        return dcNodes != null && ( ( InternalEList.Unsettable< ? > ) dcNodes ).isSet();
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
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS, CimPackage.DC_BASE_TERMINAL__DC_TOPOLOGICAL_NODE );
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
    public DCTopologicalIsland getDCTopologicalIsland() {
        return dcTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDCTopologicalIsland( DCTopologicalIsland newDCTopologicalIsland,
            NotificationChain msgs ) {
        DCTopologicalIsland oldDCTopologicalIsland = dcTopologicalIsland;
        dcTopologicalIsland = newDCTopologicalIsland;
        boolean oldDCTopologicalIslandESet = dcTopologicalIslandESet;
        dcTopologicalIslandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND, oldDCTopologicalIsland,
                    newDCTopologicalIsland, !oldDCTopologicalIslandESet );
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
    public void setDCTopologicalIsland( DCTopologicalIsland newDCTopologicalIsland ) {
        if( newDCTopologicalIsland != dcTopologicalIsland ) {
            NotificationChain msgs = null;
            if( dcTopologicalIsland != null ) msgs = ( ( InternalEObject ) dcTopologicalIsland ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES, DCTopologicalIsland.class, msgs );
            if( newDCTopologicalIsland != null )
                msgs = ( ( InternalEObject ) newDCTopologicalIsland ).eInverseAdd( this,
                        CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES, DCTopologicalIsland.class, msgs );
            msgs = basicSetDCTopologicalIsland( newDCTopologicalIsland, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalIslandESet = dcTopologicalIslandESet;
            dcTopologicalIslandESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND, newDCTopologicalIsland,
                    newDCTopologicalIsland, !oldDCTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDCTopologicalIsland( NotificationChain msgs ) {
        DCTopologicalIsland oldDCTopologicalIsland = dcTopologicalIsland;
        dcTopologicalIsland = null;
        boolean oldDCTopologicalIslandESet = dcTopologicalIslandESet;
        dcTopologicalIslandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND, oldDCTopologicalIsland, null,
                    oldDCTopologicalIslandESet );
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
    public void unsetDCTopologicalIsland() {
        if( dcTopologicalIsland != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dcTopologicalIsland ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES, DCTopologicalIsland.class, msgs );
            msgs = basicUnsetDCTopologicalIsland( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCTopologicalIslandESet = dcTopologicalIslandESet;
            dcTopologicalIslandESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND, null, null, oldDCTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTopologicalIsland() {
        return dcTopologicalIslandESet;
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
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER, oldDCEquipmentContainer,
                    newDCEquipmentContainer, !oldDCEquipmentContainerESet );
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
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE, DCEquipmentContainer.class, msgs );
            if( newDCEquipmentContainer != null )
                msgs = ( ( InternalEObject ) newDCEquipmentContainer ).eInverseAdd( this,
                        CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE, DCEquipmentContainer.class, msgs );
            msgs = basicSetDCEquipmentContainer( newDCEquipmentContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
            dcEquipmentContainerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER, newDCEquipmentContainer,
                    newDCEquipmentContainer, !oldDCEquipmentContainerESet ) );
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
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER, oldDCEquipmentContainer, null,
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
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE, DCEquipmentContainer.class, msgs );
            msgs = basicUnsetDCEquipmentContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDCEquipmentContainerESet = dcEquipmentContainerESet;
            dcEquipmentContainerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER, null, null, oldDCEquipmentContainerESet ) );
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCNodes() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            if( dcTopologicalIsland != null ) msgs = ( ( InternalEObject ) dcTopologicalIsland ).eInverseRemove( this,
                    CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES, DCTopologicalIsland.class, msgs );
            return basicSetDCTopologicalIsland( ( DCTopologicalIsland ) otherEnd, msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
            if( dcEquipmentContainer != null ) msgs = ( ( InternalEObject ) dcEquipmentContainer ).eInverseRemove( this,
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE, DCEquipmentContainer.class, msgs );
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            return ( ( InternalEList< ? > ) getDCNodes() ).basicRemove( otherEnd, msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            return ( ( InternalEList< ? > ) getDCTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            return basicUnsetDCTopologicalIsland( msgs );
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            return getDCNodes();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            return getDCTerminals();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            return getDCTopologicalIsland();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            getDCNodes().clear();
            getDCNodes().addAll( ( Collection< ? extends DCNode > ) newValue );
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            getDCTerminals().clear();
            getDCTerminals().addAll( ( Collection< ? extends DCBaseTerminal > ) newValue );
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            setDCTopologicalIsland( ( DCTopologicalIsland ) newValue );
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            unsetDCNodes();
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            unsetDCTerminals();
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            unsetDCTopologicalIsland();
            return;
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
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
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_NODES:
            return isSetDCNodes();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TERMINALS:
            return isSetDCTerminals();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND:
            return isSetDCTopologicalIsland();
        case CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER:
            return isSetDCEquipmentContainer();
        }
        return super.eIsSet( featureID );
    }

} //DCTopologicalNodeImpl
