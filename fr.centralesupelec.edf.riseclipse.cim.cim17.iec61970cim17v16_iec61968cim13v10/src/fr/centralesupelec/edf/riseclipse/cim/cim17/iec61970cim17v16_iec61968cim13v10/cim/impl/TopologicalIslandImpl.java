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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode;

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
 * An implementation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalIslandImpl#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TopologicalIslandImpl#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologicalIslandImpl extends IdentifiedObjectImpl implements TopologicalIsland {
    /**
     * The cached value of the '{@link #getAngleRefTopologicalNode() <em>Angle Ref Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleRefTopologicalNode()
     * @generated
     * @ordered
     */
    protected TopologicalNode angleRefTopologicalNode;

    /**
     * This is true if the Angle Ref Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean angleRefTopologicalNodeESet;

    /**
     * The cached value of the '{@link #getTopologicalNodes() <em>Topological Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNodes()
     * @generated
     * @ordered
     */
    protected EList< TopologicalNode > topologicalNodes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TopologicalIslandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTopologicalIsland();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalNode getAngleRefTopologicalNode() {
        return angleRefTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAngleRefTopologicalNode( TopologicalNode newAngleRefTopologicalNode,
            NotificationChain msgs ) {
        TopologicalNode oldAngleRefTopologicalNode = angleRefTopologicalNode;
        angleRefTopologicalNode = newAngleRefTopologicalNode;
        boolean oldAngleRefTopologicalNodeESet = angleRefTopologicalNodeESet;
        angleRefTopologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, oldAngleRefTopologicalNode,
                    newAngleRefTopologicalNode, !oldAngleRefTopologicalNodeESet );
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
    public void setAngleRefTopologicalNode( TopologicalNode newAngleRefTopologicalNode ) {
        if( newAngleRefTopologicalNode != angleRefTopologicalNode ) {
            NotificationChain msgs = null;
            if( angleRefTopologicalNode != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs );
            if( newAngleRefTopologicalNode != null )
                msgs = ( ( InternalEObject ) newAngleRefTopologicalNode ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs );
            msgs = basicSetAngleRefTopologicalNode( newAngleRefTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalNodeESet = angleRefTopologicalNodeESet;
            angleRefTopologicalNodeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, newAngleRefTopologicalNode,
                    newAngleRefTopologicalNode, !oldAngleRefTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAngleRefTopologicalNode( NotificationChain msgs ) {
        TopologicalNode oldAngleRefTopologicalNode = angleRefTopologicalNode;
        angleRefTopologicalNode = null;
        boolean oldAngleRefTopologicalNodeESet = angleRefTopologicalNodeESet;
        angleRefTopologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, oldAngleRefTopologicalNode, null,
                    oldAngleRefTopologicalNodeESet );
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
    public void unsetAngleRefTopologicalNode() {
        if( angleRefTopologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) angleRefTopologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs );
            msgs = basicUnsetAngleRefTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalNodeESet = angleRefTopologicalNodeESet;
            angleRefTopologicalNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, null, null,
                    oldAngleRefTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAngleRefTopologicalNode() {
        return angleRefTopologicalNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TopologicalNode > getTopologicalNodes() {
        if( topologicalNodes == null ) {
            topologicalNodes = new EObjectWithInverseResolvingEList.Unsettable< TopologicalNode >(
                    TopologicalNode.class, this, CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND );
        }
        return topologicalNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNodes() {
        if( topologicalNodes != null ) ( ( InternalEList.Unsettable< ? > ) topologicalNodes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNodes() {
        return topologicalNodes != null && ( ( InternalEList.Unsettable< ? > ) topologicalNodes ).isSet();
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            if( angleRefTopologicalNode != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs );
            return basicSetAngleRefTopologicalNode( ( TopologicalNode ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTopologicalNodes() )
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            return basicUnsetAngleRefTopologicalNode( msgs );
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            return ( ( InternalEList< ? > ) getTopologicalNodes() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            return getAngleRefTopologicalNode();
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            return getTopologicalNodes();
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            setAngleRefTopologicalNode( ( TopologicalNode ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            getTopologicalNodes().clear();
            getTopologicalNodes().addAll( ( Collection< ? extends TopologicalNode > ) newValue );
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            unsetAngleRefTopologicalNode();
            return;
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            unsetTopologicalNodes();
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
        case CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
            return isSetAngleRefTopologicalNode();
        case CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
            return isSetTopologicalNodes();
        }
        return super.eIsSet( featureID );
    }

} //TopologicalIslandImpl
