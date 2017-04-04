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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroDD;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroDD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroDDItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroDDItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addAturbPropertyDescriptor( object );
            addBturbPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addEpsPropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addInputSignalPropertyDescriptor( object );
            addK1PropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTtPropertyDescriptor( object );
            addTturbPropertyDescriptor( object );
            addVelclPropertyDescriptor( object );
            addVelopPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_aturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_aturb_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Aturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_bturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_bturb_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Bturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_db1_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Db1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_db2_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Db2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_eps_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Eps(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gmax_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gmin_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv1_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv2_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv3_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv4_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv5_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_gv6_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Gv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Input Signal feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInputSignalPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_inputSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_inputSignal_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_InputSignal(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_k1_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_K1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_k2_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_K2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_kg_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Kg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_ki_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_mwbase_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv1_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv2_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv3_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv4_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv5_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pgv6_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pgv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pmax_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_pmin_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Pmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_r_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_td_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Td(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_tf_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_tp_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_tt_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_tturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_tturb_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Tturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velcl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_velcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_velcl_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Velcl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroDD_velop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroDD_velop_feature",
                                "_UI_GovHydroDD_type" ),
                        CimPackage.eINSTANCE.getGovHydroDD_Velop(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydroDD.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroDD" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroDD ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroDD_type" )
                : getString( "_UI_GovHydroDD_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( GovHydroDD.class ) ) {
        case CimPackage.GOV_HYDRO_DD__ATURB:
        case CimPackage.GOV_HYDRO_DD__BTURB:
        case CimPackage.GOV_HYDRO_DD__DB1:
        case CimPackage.GOV_HYDRO_DD__DB2:
        case CimPackage.GOV_HYDRO_DD__EPS:
        case CimPackage.GOV_HYDRO_DD__GMAX:
        case CimPackage.GOV_HYDRO_DD__GMIN:
        case CimPackage.GOV_HYDRO_DD__GV1:
        case CimPackage.GOV_HYDRO_DD__GV2:
        case CimPackage.GOV_HYDRO_DD__GV3:
        case CimPackage.GOV_HYDRO_DD__GV4:
        case CimPackage.GOV_HYDRO_DD__GV5:
        case CimPackage.GOV_HYDRO_DD__GV6:
        case CimPackage.GOV_HYDRO_DD__INPUT_SIGNAL:
        case CimPackage.GOV_HYDRO_DD__K1:
        case CimPackage.GOV_HYDRO_DD__K2:
        case CimPackage.GOV_HYDRO_DD__KG:
        case CimPackage.GOV_HYDRO_DD__KI:
        case CimPackage.GOV_HYDRO_DD__MWBASE:
        case CimPackage.GOV_HYDRO_DD__PGV1:
        case CimPackage.GOV_HYDRO_DD__PGV2:
        case CimPackage.GOV_HYDRO_DD__PGV3:
        case CimPackage.GOV_HYDRO_DD__PGV4:
        case CimPackage.GOV_HYDRO_DD__PGV5:
        case CimPackage.GOV_HYDRO_DD__PGV6:
        case CimPackage.GOV_HYDRO_DD__PMAX:
        case CimPackage.GOV_HYDRO_DD__PMIN:
        case CimPackage.GOV_HYDRO_DD__R:
        case CimPackage.GOV_HYDRO_DD__TD:
        case CimPackage.GOV_HYDRO_DD__TF:
        case CimPackage.GOV_HYDRO_DD__TP:
        case CimPackage.GOV_HYDRO_DD__TT:
        case CimPackage.GOV_HYDRO_DD__TTURB:
        case CimPackage.GOV_HYDRO_DD__VELCL:
        case CimPackage.GOV_HYDRO_DD__VELOP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
