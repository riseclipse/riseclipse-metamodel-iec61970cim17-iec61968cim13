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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNodeContainer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectivityNodeContainerImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConnectivityNodeContainerImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeContainerImpl extends PowerSystemResourceImpl implements ConnectivityNodeContainer {
    /**
     * The cached value of the '{@link #getConnectivityNodes() <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodes()
     * @generated
     * @ordered
     */
    protected EList< ConnectivityNode > connectivityNodes;

    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected EList< TopologicalNode > topologicalNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectivityNodeContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConnectivityNodeContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConnectivityNode > getConnectivityNodes() {
        if( connectivityNodes == null ) {
            connectivityNodes = new EObjectWithInverseResolvingEList.Unsettable< ConnectivityNode >(
                    ConnectivityNode.class, this, CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES,
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER );
        }
        return connectivityNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNodes() {
        if( connectivityNodes != null ) ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodes() {
        return connectivityNodes != null && ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TopologicalNode > getTopologicalNode() {
        if( topologicalNode == null ) {
            topologicalNode = new EObjectWithInverseResolvingEList.Unsettable< TopologicalNode >( TopologicalNode.class,
                    this, CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER );
        }
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) ( ( InternalEList.Unsettable< ? > ) topologicalNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNode != null && ( ( InternalEList.Unsettable< ? > ) topologicalNode ).isSet();
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConnectivityNodes() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTopologicalNode() )
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            return ( ( InternalEList< ? > ) getConnectivityNodes() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            return ( ( InternalEList< ? > ) getTopologicalNode() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            return getConnectivityNodes();
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            return getTopologicalNode();
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            getConnectivityNodes().clear();
            getConnectivityNodes().addAll( ( Collection< ? extends ConnectivityNode > ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            getTopologicalNode().clear();
            getTopologicalNode().addAll( ( Collection< ? extends TopologicalNode > ) newValue );
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            unsetConnectivityNodes();
            return;
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
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
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
            return isSetConnectivityNodes();
        case CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        }
        return super.eIsSet( featureID );
    }

} //ConnectivityNodeContainerImpl
