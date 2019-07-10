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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPID;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPID} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroPIDItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroPIDItemProvider( AdapterFactory adapterFactory ) {
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
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addInputSignalPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_aturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_aturb_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Aturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_bturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_bturb_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Bturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_db1_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Db1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_db2_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Db2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_eps_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Eps(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv1_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv2_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv3_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv4_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv5_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_gv6_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Gv6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_inputSignal_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_inputSignal_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_InputSignal(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_kd_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Kd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_kg_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Kg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_ki_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Ki(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_kp_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_mwbase_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Mwbase(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv1_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv2_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv3_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv4_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv4(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv5_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv5(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pgv6_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pgv6(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pmax_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_pmin_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Pmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_r_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_R(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_td_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Td(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_tf_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Tf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_tp_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Tp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_tt_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Tt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_tturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_tturb_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Tturb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_velcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_velcl_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Velcl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPID_velop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPID_velop_feature",
                                "_UI_GovHydroPID_type" ),
                        CimPackage.eINSTANCE.getGovHydroPID_Velop(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovHydroPID.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroPID" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroPID ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroPID_type" )
                : getString( "_UI_GovHydroPID_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroPID.class ) ) {
        case CimPackage.GOV_HYDRO_PID__ATURB:
        case CimPackage.GOV_HYDRO_PID__BTURB:
        case CimPackage.GOV_HYDRO_PID__DB1:
        case CimPackage.GOV_HYDRO_PID__DB2:
        case CimPackage.GOV_HYDRO_PID__EPS:
        case CimPackage.GOV_HYDRO_PID__GV1:
        case CimPackage.GOV_HYDRO_PID__GV2:
        case CimPackage.GOV_HYDRO_PID__GV3:
        case CimPackage.GOV_HYDRO_PID__GV4:
        case CimPackage.GOV_HYDRO_PID__GV5:
        case CimPackage.GOV_HYDRO_PID__GV6:
        case CimPackage.GOV_HYDRO_PID__INPUT_SIGNAL:
        case CimPackage.GOV_HYDRO_PID__KD:
        case CimPackage.GOV_HYDRO_PID__KG:
        case CimPackage.GOV_HYDRO_PID__KI:
        case CimPackage.GOV_HYDRO_PID__KP:
        case CimPackage.GOV_HYDRO_PID__MWBASE:
        case CimPackage.GOV_HYDRO_PID__PGV1:
        case CimPackage.GOV_HYDRO_PID__PGV2:
        case CimPackage.GOV_HYDRO_PID__PGV3:
        case CimPackage.GOV_HYDRO_PID__PGV4:
        case CimPackage.GOV_HYDRO_PID__PGV5:
        case CimPackage.GOV_HYDRO_PID__PGV6:
        case CimPackage.GOV_HYDRO_PID__PMAX:
        case CimPackage.GOV_HYDRO_PID__PMIN:
        case CimPackage.GOV_HYDRO_PID__R:
        case CimPackage.GOV_HYDRO_PID__TD:
        case CimPackage.GOV_HYDRO_PID__TF:
        case CimPackage.GOV_HYDRO_PID__TP:
        case CimPackage.GOV_HYDRO_PID__TT:
        case CimPackage.GOV_HYDRO_PID__TTURB:
        case CimPackage.GOV_HYDRO_PID__VELCL:
        case CimPackage.GOV_HYDRO_PID__VELOP:
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
