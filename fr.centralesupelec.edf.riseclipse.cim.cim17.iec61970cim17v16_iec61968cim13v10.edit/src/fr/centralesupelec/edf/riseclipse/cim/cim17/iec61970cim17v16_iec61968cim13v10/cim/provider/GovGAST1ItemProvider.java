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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovGAST1ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovGAST1ItemProvider( AdapterFactory adapterFactory ) {
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

            addAPropertyDescriptor( object );
            addBPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addEpsPropertyDescriptor( object );
            addFidlePropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKtPropertyDescriptor( object );
            addLmaxPropertyDescriptor( object );
            addLoadincPropertyDescriptor( object );
            addLtratePropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addRmaxPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addTltrPropertyDescriptor( object );
            addVmaxPropertyDescriptor( object );
            addVminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the A feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_a_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_a_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_A(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_b_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_b_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_B(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_db1_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Db1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_db2_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Db2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_eps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_eps_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Eps(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fidle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFidlePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_fidle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_fidle_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Fidle(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv1_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv2_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv3_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv4_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv5_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_gv6_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Gv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_ka_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_kt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_kt_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Kt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_lmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_lmax_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Lmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Loadinc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadincPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_loadinc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_loadinc_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Loadinc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ltrate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLtratePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_ltrate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_ltrate_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Ltrate(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_mwbase_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Mwbase(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv1_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv2_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv3_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv4_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv5_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_pgv6_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Pgv6(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST1_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_r_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_rmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_rmax_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Rmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_t1_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_t2_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_t3_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_T3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_t4_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_T4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_t5_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_T5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tltr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTltrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_tltr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_tltr_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Tltr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_vmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_vmax_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Vmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST1_vmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST1_vmin_feature",
                                "_UI_GovGAST1_type" ),
                        CimPackage.eINSTANCE.getGovGAST1_Vmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovGAST1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovGAST1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovGAST1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovGAST1_type" )
                : getString( "_UI_GovGAST1_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovGAST1.class ) ) {
        case CimPackage.GOV_GAST1__A:
        case CimPackage.GOV_GAST1__B:
        case CimPackage.GOV_GAST1__DB1:
        case CimPackage.GOV_GAST1__DB2:
        case CimPackage.GOV_GAST1__EPS:
        case CimPackage.GOV_GAST1__FIDLE:
        case CimPackage.GOV_GAST1__GV1:
        case CimPackage.GOV_GAST1__GV2:
        case CimPackage.GOV_GAST1__GV3:
        case CimPackage.GOV_GAST1__GV4:
        case CimPackage.GOV_GAST1__GV5:
        case CimPackage.GOV_GAST1__GV6:
        case CimPackage.GOV_GAST1__KA:
        case CimPackage.GOV_GAST1__KT:
        case CimPackage.GOV_GAST1__LMAX:
        case CimPackage.GOV_GAST1__LOADINC:
        case CimPackage.GOV_GAST1__LTRATE:
        case CimPackage.GOV_GAST1__MWBASE:
        case CimPackage.GOV_GAST1__PGV1:
        case CimPackage.GOV_GAST1__PGV2:
        case CimPackage.GOV_GAST1__PGV3:
        case CimPackage.GOV_GAST1__PGV4:
        case CimPackage.GOV_GAST1__PGV5:
        case CimPackage.GOV_GAST1__PGV6:
        case CimPackage.GOV_GAST1__R:
        case CimPackage.GOV_GAST1__RMAX:
        case CimPackage.GOV_GAST1__T1:
        case CimPackage.GOV_GAST1__T2:
        case CimPackage.GOV_GAST1__T3:
        case CimPackage.GOV_GAST1__T4:
        case CimPackage.GOV_GAST1__T5:
        case CimPackage.GOV_GAST1__TLTR:
        case CimPackage.GOV_GAST1__VMAX:
        case CimPackage.GOV_GAST1__VMIN:
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
