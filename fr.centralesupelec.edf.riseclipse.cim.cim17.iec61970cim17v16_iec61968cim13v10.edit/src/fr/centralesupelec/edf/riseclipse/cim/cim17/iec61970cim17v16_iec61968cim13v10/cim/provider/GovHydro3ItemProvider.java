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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydro3ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydro3ItemProvider( AdapterFactory adapterFactory ) {
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

            addAtPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addDturbPropertyDescriptor( object );
            addEpsPropertyDescriptor( object );
            addGovernorControlPropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addH0PropertyDescriptor( object );
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
            addQnlPropertyDescriptor( object );
            addRelecPropertyDescriptor( object );
            addRgatePropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTtPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addVelclPropertyDescriptor( object );
            addVelopPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_at_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_at_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_At(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_db1_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Db1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_db2_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Db2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_dturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_dturb_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Dturb(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_eps_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Eps(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Governor Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_governorControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_governorControl_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_GovernorControl(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv1_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv2_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv3_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv4_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv5_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_gv6_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Gv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the H0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addH0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_h0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_h0_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_H0(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_k1_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_K1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_k2_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_K2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_kg_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Kg(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_ki_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Ki(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_mwbase_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Mwbase(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv1_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv2_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv3_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv4_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv5_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pgv6_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pgv6(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pmax_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_pmin_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Pmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qnl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQnlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_qnl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_qnl_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Qnl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Relec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelecPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_relec_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_relec_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Relec(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rgate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRgatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_rgate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_rgate_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Rgate(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_td_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Td(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_tf_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Tf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_tp_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Tp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_tt_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro3_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_tw_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Tw(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_velcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_velcl_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Velcl(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro3_velop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro3_velop_feature",
                                "_UI_GovHydro3_type" ),
                        CimPackage.eINSTANCE.getGovHydro3_Velop(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydro3.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydro3" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydro3 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydro3_type" )
                : getString( "_UI_GovHydro3_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydro3.class ) ) {
        case CimPackage.GOV_HYDRO3__AT:
        case CimPackage.GOV_HYDRO3__DB1:
        case CimPackage.GOV_HYDRO3__DB2:
        case CimPackage.GOV_HYDRO3__DTURB:
        case CimPackage.GOV_HYDRO3__EPS:
        case CimPackage.GOV_HYDRO3__GOVERNOR_CONTROL:
        case CimPackage.GOV_HYDRO3__GV1:
        case CimPackage.GOV_HYDRO3__GV2:
        case CimPackage.GOV_HYDRO3__GV3:
        case CimPackage.GOV_HYDRO3__GV4:
        case CimPackage.GOV_HYDRO3__GV5:
        case CimPackage.GOV_HYDRO3__GV6:
        case CimPackage.GOV_HYDRO3__H0:
        case CimPackage.GOV_HYDRO3__K1:
        case CimPackage.GOV_HYDRO3__K2:
        case CimPackage.GOV_HYDRO3__KG:
        case CimPackage.GOV_HYDRO3__KI:
        case CimPackage.GOV_HYDRO3__MWBASE:
        case CimPackage.GOV_HYDRO3__PGV1:
        case CimPackage.GOV_HYDRO3__PGV2:
        case CimPackage.GOV_HYDRO3__PGV3:
        case CimPackage.GOV_HYDRO3__PGV4:
        case CimPackage.GOV_HYDRO3__PGV5:
        case CimPackage.GOV_HYDRO3__PGV6:
        case CimPackage.GOV_HYDRO3__PMAX:
        case CimPackage.GOV_HYDRO3__PMIN:
        case CimPackage.GOV_HYDRO3__QNL:
        case CimPackage.GOV_HYDRO3__RELEC:
        case CimPackage.GOV_HYDRO3__RGATE:
        case CimPackage.GOV_HYDRO3__TD:
        case CimPackage.GOV_HYDRO3__TF:
        case CimPackage.GOV_HYDRO3__TP:
        case CimPackage.GOV_HYDRO3__TT:
        case CimPackage.GOV_HYDRO3__TW:
        case CimPackage.GOV_HYDRO3__VELCL:
        case CimPackage.GOV_HYDRO3__VELOP:
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
